const express = require("express");
const router = express.Router();
const User = require("../models/User");

// POST /api/auth/signup
router.post("/signup", async (req, res) => {
  try {
    const { username, password, name, age, gender } = req.body;

    // Basic validations
    if (!username || !password || !name || age === undefined || !gender) {
      return res.status(400).json({ error: "All fields are required." });
    }
    if (String(password).length < 6) {
      return res
        .status(400)
        .json({ error: "Password must be at least 6 characters." });
    }

    // Create & save
    const user = new User({
      username,
      password, // gets hashed by pre('save')
      name,
      age: Number(age),
      gender,
    });

    await user.save();

    return res.status(201).json({
      message: "User created successfully",
      userId: user._id,
      username: user.username,
    });
  } catch (err) {
    // Duplicate username error
    if (err && err.code === 11000) {
      return res.status(409).json({ error: "Username already exists." });
    }
    console.error("Signup error:", err);
    return res.status(500).json({ error: "Server error." });
  }
});

// 🔐 Login route
router.post("/login", async (req, res) => {
  try {
    const { username, password } = req.body;

    const user = await User.findOne({ username, password });
    if (!user) return res.status(401).json({ message: "Invalid credentials" });

    res.json({ message: "Login successful", user });
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
});

module.exports = router;
