import React from 'react';
import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import { AuthProvider } from './context/AuthContext';
import Login from './components/Login';
import Register from './components/Register';
import ProtectedRoute from './components/ProtectedRoute';
import DashboardAdmin from './components/DashboardAdmin';
import DashboardManager from './components/DashboardManager';
import DashboardDriver from './components/DashboardDriver';
import DashboardCustomer from './components/DashboardCustomer';


function App(){
  return (
    <AuthProvider>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Navigate to="/login" replace />} />
          <Route path="/login" element={<Login/>} />
          <Route path="/register" element={<Register/>} />

          <Route path="/admin" element={
            <ProtectedRoute allowedRoles="admin">
              <DashboardAdmin/>
            </ProtectedRoute>
          } />

          <Route path="/manager" element={
            <ProtectedRoute allowedRoles="fleetmanager">
              <DashboardManager/>
            </ProtectedRoute>
          } />

          <Route path="/driver" element={
            <ProtectedRoute allowedRoles="driver">
              <DashboardDriver/>
            </ProtectedRoute>
          } />

          <Route path="/customer" element={
            <ProtectedRoute allowedRoles="customer">
              <DashboardCustomer/>
            </ProtectedRoute>
          } />

          <Route path="/unauthorized" element={<div className="p-6">Unauthorized access. <a href="/login" className="text-blue-600">Login</a></div>} />
        </Routes>
      </BrowserRouter>
    </AuthProvider>
  );
}

export default App;
