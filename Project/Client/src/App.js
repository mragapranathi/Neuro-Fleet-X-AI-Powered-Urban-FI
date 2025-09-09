import { useState } from "react";
import LoginPage from "./LoginPage";
import SignupPage from "./SignupPage";

function App() {
  const [showLogin, setShowLogin] = useState(true);

  return showLogin ? (
    <LoginPage onSwitch={() => setShowLogin(false)} />
  ) : (
    <SignupPage onSwitch={() => setShowLogin(true)} />
  );
}

export default App;
