require('dotenv').config();
const connectDB = require('./config/db');
const User = require('./models/User');
const bcrypt = require('bcryptjs');

(async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    const email = 'admin@example.com';
    let admin = await User.findOne({ email });
    if (admin) {
      console.log('Admin exists:', admin.email);
      process.exit(0);
    }
    const hashed = await bcrypt.hash('Admin@123', 10);
    admin = new User({ name: 'Admin User', email, password: hashed, role: 'admin' });
    await admin.save();
    console.log('Admin created: admin@example.com / Admin@123');
    process.exit(0);
  } catch (err) {
    console.error(err);
    process.exit(1);
  }
})();
