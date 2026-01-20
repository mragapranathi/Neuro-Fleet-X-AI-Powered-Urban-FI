const User = require('../models/User');
const bcrypt = require('bcryptjs');
const jwt = require('jsonwebtoken');

const generateToken = (user) => {
  return jwt.sign({ id: user._id, role: user.role }, process.env.JWT_SECRET, { expiresIn: '1d' });
};

exports.register = async (req, res) => {
  const { name, email, password, role } = req.body;
  if (!name || !email || !password || !role) {
    return res.status(400).json({ message: 'Please provide name, email, password and role' });
  }
  try {
    let user = await User.findOne({ email });
    if (user) return res.status(400).json({ message: 'Email already in use' });

    const hashed = await bcrypt.hash(password, 10);
    user = new User({ name, email, password: hashed, role: role.toLowerCase() });
    await user.save();
    const token = generateToken(user);
    res.json({ token, user: { id: user._id, name: user.name, email: user.email, role: user.role } });
  } catch (err) {
    console.error(err);
    res.status(500).json({ message: 'Server error' });
  }
};

exports.login = async (req, res) => {
  const { email, password } = req.body;
  if (!email || !password) return res.status(400).json({ message: 'Provide email and password' });

  try{
    const user = await User.findOne({ email });
    if (!user) return res.status(400).json({ message: 'Invalid credentials' });

    const isMatch = await bcrypt.compare(password, user.password);
    if (!isMatch) return res.status(400).json({ message: 'Invalid credentials' });

    const token = generateToken(user);
    res.json({ token, user: { id: user._id, name: user.name, email: user.email, role: user.role } });
  }catch(err){
    console.error(err);
    res.status(500).json({ message: 'Server error' });
  }
};

exports.getMe = async (req, res) => {
  if (!req.user) return res.status(401).json({ message: 'Not authorized' });
  res.json({ user: req.user });
};

// simple role dashboards:
exports.adminDashboard = (req, res) => {
  res.json({ message: `Hello Admin ${req.user.name}`, stats: { users: 100, vehicles: 20 }});
};
exports.managerDashboard = (req, res) => {
  res.json({ message: `Hello Fleet Manager ${req.user.name}`, tasks: ['assign driver','view routes']});
};
exports.driverDashboard = (req, res) => {
  res.json({ message: `Hello Driver ${req.user.name}`, assignments: []});
};
exports.customerDashboard = (req, res) => {
  res.json({ message: `Hello Customer ${req.user.name}`, bookings: []});
};
