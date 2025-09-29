import React, { useState, useContext } from 'react';
import { useNavigate } from 'react-router-dom';
import { AuthContext } from '../context/AuthContext';

const Register = () => {
  const { register } = useContext(AuthContext);
  const [name,setName]=useState('');
  const [email,setEmail]=useState('');
  const [password,setPassword]=useState('');
  const [role,setRole]=useState('customer');
  const [error,setError]=useState(null);
  const navigate = useNavigate();

  const submit = async (e) => {
    e.preventDefault();
    try {
      const res = await register(name, email, password, role);
      if (res.user.role === 'admin') navigate('/admin');
      else if (res.user.role === 'fleetmanager') navigate('/manager');
      else if (res.user.role === 'driver') navigate('/driver');
      else navigate('/customer');
    } catch (err) {
      setError(err?.response?.data?.message || 'Registration failed');
    }
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gray-50">
      <form onSubmit={submit} className="w-full max-w-md bg-white p-8 rounded shadow">
        <h2 className="text-2xl font-semibold mb-4">Register</h2>
        {error && <div className="text-red-600 mb-2">{error}</div>}
        <div className="space-y-3">
          <div>
            <label>Name</label>
            <input value={name} onChange={e=>setName(e.target.value)} className="w-full border p-2 rounded" required />
          </div>
          <div>
            <label>Email</label>
            <input value={email} onChange={e=>setEmail(e.target.value)} type="email" className="w-full border p-2 rounded" required />
          </div>
          <div>
            <label>Password</label>
            <input value={password} onChange={e=>setPassword(e.target.value)} type="password" className="w-full border p-2 rounded" required />
          </div>
          <div>
            <label>Role</label>
            <select className="w-full border p-2 rounded" value={role} onChange={e=>setRole(e.target.value)}>
              <option value="customer">Customer</option>
              <option value="driver">Driver</option>
              <option value="fleetmanager">Fleet Manager</option>
              <option value="admin">Admin</option>
            </select>
            <small className="text-xs text-gray-500">In production restrict admin/manager registration.</small>
          </div>
          <button className="w-full bg-green-600 text-white p-2 rounded">Create account</button>
        </div>
      </form>
    </div>
  );
};

export default Register;
