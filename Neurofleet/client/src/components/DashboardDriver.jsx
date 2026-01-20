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

export default function Driver() {
  return (
    <div className="p-6 space-y-6">
      <h1 className="text-2xl font-bold text-orange-600">Driver Dashboard</h1>

      <div className="grid grid-cols-3 gap-4">
        <div className="p-4 bg-orange-500/20 rounded-xl">Today’s Earnings: <b>₹1850</b></div>
        <div className="p-4 bg-blue-500/20 rounded-xl">Trips Completed: <b>6</b></div>
        <div className="p-4 bg-green-500/20 rounded-xl">Rating: <b>4.7</b></div>
      </div>

      <div className="bg-white/10 p-4 rounded-xl">
        <h2 className="font-semibold mb-3">Assigned Trips</h2>
        <div className="p-3 bg-white/5 rounded-lg flex justify-between">
          <div>
            <div className="font-medium">Connaught → India Gate</div>
            <div className="text-xs opacity-80">ETA: 12 min</div>
          </div>
          <div className="flex gap-2">
            <button className="px-3 py-1 bg-green-600 rounded text-white">Start</button>
            <button className="px-3 py-1 bg-gray-700 rounded text-white">Chat</button>
          </div>
        </div>
      </div>
    </div>
  );
}
