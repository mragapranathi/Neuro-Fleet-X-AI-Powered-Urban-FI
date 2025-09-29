import React, { useState, useContext } from 'react';
import { useNavigate, Link } from 'react-router-dom';
import { AuthContext } from '../context/AuthContext';

const Login = () => {
  const { login } = useContext(AuthContext);
  const [email, setEmail] = useState('');
  const [password,setPassword]=useState('');
  const [selectedRole,setSelectedRole]=useState('customer');
  const [error,setError]=useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const res = await login(email, password);
      const role = res.user.role;
      if (role === 'admin') navigate('/admin');
      else if (role === 'fleetmanager') navigate('/manager');
      else if (role === 'driver') navigate('/driver');
      else navigate('/customer');
    } catch (err) {
      setError(err?.response?.data?.message || 'Login failed');
    }
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gray-50">
      <div className="w-full max-w-md bg-white p-8 rounded shadow">
        <h2 className="text-2xl font-semibold mb-4">Login</h2>
        {error && <div className="text-red-600 mb-2">{error}</div>}
        <form onSubmit={handleSubmit} className="space-y-4">
          <div>
            <label className="block text-sm">Email</label>
            <input value={email} onChange={e=>setEmail(e.target.value)} type="email" className="w-full border p-2 rounded" required />
          </div>
          <div>
            <label className="block text-sm">Password</label>
            <input value={password} onChange={e=>setPassword(e.target.value)} type="password" className="w-full border p-2 rounded" required />
          </div>
          <div>
            <label className="block text-sm">Role</label>
            <select value={selectedRole} onChange={e=>setSelectedRole(e.target.value)} className="w-full border p-2 rounded">
              <option value="customer">Customer</option>
              <option value="driver">Driver</option>
              <option value="fleetmanager">Fleet Manager</option>
              <option value="admin">Admin</option>
            </select>
          </div>
          <button className="w-full bg-blue-600 text-white p-2 rounded">Login</button>
        </form>
        <p className="mt-4 text-sm">Don't have an account? <Link className="text-blue-600" to="/register">Register</Link></p>
      </div>
    </div>
  );
};

export default Login;
