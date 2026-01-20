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

import React from "react";

export default function Admin() {
  return (
    <div className="p-6 space-y-6">
      <h1 className="text-2xl font-bold text-pink-600">Admin Dashboard</h1>

      <div className="grid grid-cols-4 gap-4">
        <div className="p-4 bg-pink-500/20 rounded-xl">Total Users: <b>3120</b></div>
        <div className="p-4 bg-indigo-500/20 rounded-xl">Active Sessions: <b>245</b></div>
        <div className="p-4 bg-yellow-500/20 rounded-xl">Tickets: <b>6</b></div>
        <div className="p-4 bg-green-500/20 rounded-xl">Revenue: <b>₹4.2M</b></div>
      </div>

      <div className="bg-white/10 p-4 rounded-xl">
        <h2 className="font-semibold mb-3">System Health</h2>
        <div className="grid grid-cols-3 gap-4">
          <div className="p-3 bg-white/5 rounded">Security: <b>OK</b></div>
          <div className="p-3 bg-white/5 rounded">Deployments: <b>2 pending</b></div>
          <div className="p-3 bg-white/5 rounded">Integrations: <b>Payments, Maps</b></div>
        </div>
      </div>
    </div>
  );
}
