// import React, { useContext, useEffect, useState } from 'react';
// import API from '../api';
// import { AuthContext } from '../context/AuthContext';

// const DashboardAdmin = () => {
//   const { user, logout } = useContext(AuthContext);
//   const [data,setData] = useState(null);

//   useEffect(() => {
//     (async () => {
//       try {
//         const { data } = await API.get('/auth/dashboard/admin');
//         setData(data);
//       } catch (err) {
//         console.error(err);
//       }
//     })();
//   },[]);

//   return (
//     <div className="p-6">
//       <header className="flex justify-between items-center">
//         <h1 className="text-2xl">Admin Dashboard</h1>
//         <div>
//           <span className="mr-4">{user?.name} ({user?.role})</span>
//           <button onClick={logout} className="px-3 py-1 border rounded">Logout</button>
//         </div>
//       </header>
//       <main className="mt-6">
//         <pre>{JSON.stringify(data, null, 2)}</pre>
//       </main>
//     </div>
//   );
// };
// export default DashboardAdmin;
import React, { useState, useEffect } from "react";
import "./DashboardCustomer.css";

const DashboardCustomer = () => {
  const [trafficLevel, setTrafficLevel] = useState("Moderate");
  const [emergencies, setEmergencies] = useState(2);
  const [bestRoute, setBestRoute] = useState("Route A - 15 mins");

  // Simulate dynamic updates
  useEffect(() => {
    const interval = setInterval(() => {
      const levels = ["Light", "Moderate", "Heavy"];
      setTrafficLevel(levels[Math.floor(Math.random() * levels.length)]);
      setEmergencies(Math.floor(Math.random() * 5));
      const routes = [
        "Route A - 15 mins",
        "Route B - 20 mins",
        "Route C - 18 mins",
      ];
      setBestRoute(routes[Math.floor(Math.random() * routes.length)]);
    }, 5000);

    return () => clearInterval(interval);
  }, []);

  return (
    <div className="dashboard-container">
      <h1>Welcome, Customer!</h1>

      {/* Key Stats */}
      <div className="cards-container">
        <div className="card">
          <h2>Total Orders</h2>
          <p>24</p>
        </div>
        <div className="card">
          <h2>Pending Deliveries</h2>
          <p>5</p>
        </div>
        <div className="card">
          <h2>Emergencies Nearby</h2>
          <p>{emergencies}</p>
        </div>
        <div className="card">
          <h2>Traffic Level</h2>
          <p>{trafficLevel}</p>
        </div>
      </div>

      {/* Interactive Features */}
      <h2 className="section-title">Smart Dashboard Features</h2>
      <div className="features-container">
        <div className="feature-card">
          <h3>Traffic Monitoring</h3>
          <p>Real-time updates on traffic in your area and upcoming routes.</p>
        </div>
        <div className="feature-card">
          <h3>Emergency Alerts</h3>
          <p>Be notified immediately about accidents or road closures nearby.</p>
        </div>
        <div className="feature-card">
          <h3>Best Routes & ETA</h3>
          <p>Our AI suggests the fastest routes based on traffic conditions.</p>
          <p><strong>Current Best Route:</strong> {bestRoute}</p>
        </div>
        <div className="feature-card">
          <h3>Traffic Signals & Smart Routing</h3>
          <p>Predictive signal timings help plan smooth trips with minimal delays.</p>
        </div>
        <div className="feature-card">
          <h3>Predictive Maintenance Alerts</h3>
          <p>Notifications on vehicle health to avoid breakdowns during your deliveries.</p>
        </div>
      </div>
    </div>
  );
};

export default DashboardCustomer;
