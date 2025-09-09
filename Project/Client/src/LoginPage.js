import { useState } from "react";
import axios from "axios";

export default function LoginPage({ onSwitch }) {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [msg, setMsg] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    setMsg("");
    try {
      const res = await axios.post("http://localhost:5000/api/auth/login", { username, password });
      setMsg(`✅ ${res.data.message}`);
    } catch (err) {
      setMsg(`❌ ${err.response?.data?.message || "Login failed"}`);
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
          Login
        </h2>

        <form onSubmit={handleSubmit} style={{ display: "grid", gap: 12 }}>
          <input
            type="text"
            placeholder="Username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            required
            style={inputStyle}
          />
          <input
            type="password"
            placeholder="Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
            style={inputStyle}
          />
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
            Login
          </button>
        </form>

        <p style={{ textAlign: "center", marginTop: 16, color: "white" }}>
          Don’t have an account?{" "}
          <button
            onClick={onSwitch}
            style={{
              background: "none",
              border: "none",
              color: "#fff",
              textDecoration: "underline",
              cursor: "pointer",
              fontWeight: 600,
            }}
          >
            Signup
          </button>
        </p>

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
