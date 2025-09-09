import { useState } from "react";

export default function SignupPage() {
  const [form, setForm] = useState({
    username: "",
    password: "",
    name: "",
    age: "",
    gender: "Male",
  });
  const [msg, setMsg] = useState("");

  const handleChange = (e) => {
    const { name, value } = e.target;
    setForm((f) => ({ ...f, [name]: value }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setMsg("");

    try {
      const res = await fetch("http://localhost:5000/api/auth/signup", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
          ...form,
          age: Number(form.age),
        }),
      });

      const data = await res.json();
      if (res.ok) {
        setMsg(`✅ ${data.message} (userId: ${data.userId})`);
        setForm({ username: "", password: "", name: "", age: "", gender: "Male" });
      } else {
        setMsg(`❌ ${data.error || "Signup failed"}`);
      }
    } catch (err) {
      setMsg("❌ Network error. Is the server running?");
      console.error(err);
    }
  };

  return (
    <div style={{
      minHeight: "100vh",
      display: "flex",
      alignItems: "center",
      justifyContent: "center",
      background: "linear-gradient(135deg,#7c3aed,#ec4899,#fb923c)",
      padding: 16
    }}>
      <div style={{
        width: 380,
        background: "rgba(255,255,255,0.2)",
        backdropFilter: "blur(16px)",
        borderRadius: 16,
        boxShadow: "0 25px 60px rgba(0,0,0,0.3)",
        border: "1px solid rgba(255,255,255,0.3)",
        padding: 24
      }}>
        <h2 style={{ color: "white", textAlign: "center", marginBottom: 24 }}>
          Signup
        </h2>

        <form onSubmit={handleSubmit} style={{ display: "grid", gap: 12 }}>
          <input
            name="username"
            placeholder="Username"
            value={form.username}
            onChange={handleChange}
            required
            style={inputStyle}
          />
          <input
            type="password"
            name="password"
            placeholder="Password (min 6 chars)"
            value={form.password}
            onChange={handleChange}
            required
            style={inputStyle}
          />
          <input
            name="name"
            placeholder="Full Name"
            value={form.name}
            onChange={handleChange}
            required
            style={inputStyle}
          />
          <input
            type="number"
            name="age"
            placeholder="Age"
            value={form.age}
            onChange={handleChange}
            required
            style={inputStyle}
            min={0}
            max={120}
          />
          <select
            name="gender"
            value={form.gender}
            onChange={handleChange}
            required
            style={inputStyle}
          >
            <option>Male</option>
            <option>Female</option>
            <option>Other</option>
          </select>

          <button
            type="submit"
            style={{
              width: "100%",
              background:
                "linear-gradient(90deg, #a855f7, #ec4899, #fb923c)",
              color: "white",
              fontWeight: 600,
              padding: "10px 0",
              border: "none",
              borderRadius: 12,
              cursor: "pointer",
            }}
          >
            Create Account
          </button>
        </form>

        {msg && (
          <p style={{
            marginTop: 12,
            textAlign: "center",
            color: msg.startsWith("✅") ? "#BBF7D0" : "#FCA5A5",
            fontWeight: 600
          }}>
            {msg}
          </p>
        )}
      </div>
    </div>
  );
}

const inputStyle = {
  width: "100%",
  padding: "12px",
  borderRadius: 12,
  border: "none",
  outline: "none",
  background: "rgba(255,255,255,0.85)",
};
