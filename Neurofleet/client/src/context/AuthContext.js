import React, { createContext, useState, useEffect } from 'react';
import API from '../api';

export const AuthContext = createContext();

export const AuthProvider = ({ children }) => {
  const [user, setUser] = useState(() => {
    const raw = localStorage.getItem('user');
    return raw ? JSON.parse(raw) : null;
  });
  const [token, setToken] = useState(() => localStorage.getItem('token'));
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    if (token && !user) {
      (async () => {
        try {
          const { data } = await API.get('/auth/me');
          setUser(data.user);
          localStorage.setItem('user', JSON.stringify(data.user));
        } catch (err) {
          console.error(err);
          logout();
        }
      })();
    }
  }, [token]);

  const login = async (email, password) => {
    setLoading(true);
    const { data } = await API.post('/auth/login', { email, password });
    localStorage.setItem('token', data.token);
    localStorage.setItem('user', JSON.stringify(data.user));
    setToken(data.token);
    setUser(data.user);
    setLoading(false);
    return data;
  };

  const register = async (name, email, password, role) => {
    setLoading(true);
    const { data } = await API.post('/auth/register', { name, email, password, role });
    localStorage.setItem('token', data.token);
    localStorage.setItem('user', JSON.stringify(data.user));
    setToken(data.token);
    setUser(data.user);
    setLoading(false);
    return data;
  };

  const logout = () => {
    setUser(null);
    setToken(null);
    localStorage.removeItem('token');
    localStorage.removeItem('user');
  };

  return <AuthContext.Provider value={{ user, token, login, register, logout, loading }}>{children}</AuthContext.Provider>;
};
