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

const vehicles = [
  { id: 1, name: "Vehicle A", status: "On Duty" },
  { id: 2, name: "Vehicle B", status: "Idle" },
];

export default function FleetManager() {
  return (
    <div className="p-6 space-y-6">
      <h1 className="text-2xl font-bold text-emerald-600">Fleet Manager Dashboard</h1>

      <div className="grid grid-cols-3 gap-4">
        <div className="p-4 bg-emerald-500/20 rounded-xl">Total Vehicles: <b>{vehicles.length}</b></div>
        <div className="p-4 bg-yellow-500/20 rounded-xl">On Duty: <b>1</b></div>
        <div className="p-4 bg-purple-500/20 rounded-xl">Idle: <b>1</b></div>
      </div>

      <div className="bg-white/10 p-4 rounded-xl">
        <h2 className="font-semibold mb-3">Fleet Overview</h2>
        <table className="w-full text-sm">
          <thead className="opacity-70">
            <tr><th>Vehicle</th><th>Status</th><th>Action</th></tr>
          </thead>
          <tbody>
            {vehicles.map(v => (
              <tr key={v.id} className="border-t border-white/10">
                <td className="py-2">{v.name}</td>
                <td>{v.status}</td>
                <td><button className="px-2 py-1 bg-indigo-500/40 rounded">Assign</button></td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}
