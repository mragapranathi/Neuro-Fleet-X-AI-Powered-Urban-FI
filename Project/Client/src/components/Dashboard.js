import React, { useEffect, useState } from 'react';
import axios from 'axios';

function Dashboard() {
  const [data, setData] = useState(null);

  useEffect(() => {
    const fetchDashboard = async () => {
      const token = localStorage.getItem('token');
      const res = await axios.get('/api/dashboard', {
        headers: { Authorization: `Bearer ${token}` },
      });
      setData(res.data);
    };
    fetchDashboard();
  }, []);

  return (
    <div>
      <h1>Fleet Dashboard</h1>
      {data ? <pre>{JSON.stringify(data, null, 2)}</pre> : <p>Loading...</p>}
    </div>
  );
}

export default Dashboard;
