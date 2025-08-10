import React, { useState } from 'react';

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function GuestGreeting() {
  return (
    <div>
      <h2>Welcome Guest</h2>
      <p>Please log in to book tickets.</p>
      <ul>
        <li>Flight D2 - Bengaluru to Goa</li>
        <li>Flight E3 - Kolkata to Bangkok</li>
        <li>Flight F4 - Pune to Jaipur</li>
        <li>Flight G5 - Ahmedabad to Kochi</li>
        <li>Flight H6 - Lucknow to Patna</li>
      </ul>
    </div>
  );
}

function UserGreeting() {
  return (
    <div>
      <h2>Welcome User</h2>
      <p>You can now book tickets.</p>
      <ul>
        <li>Flight D2 - Bengaluru to Goa <button>Book</button></li>
        <li>Flight E3 - Kolkata to Bangkok <button>Book</button></li>
        <li>Flight F4 - Pune to Jaipur <button>Book</button></li>
        <li>Flight G5 - Ahmedabad to Kochi <button>Book</button></li>
        <li>Flight H6 - Lucknow to Patna <button>Book</button></li>
      </ul>
    </div>
  );
}

function Greeting({ isLoggedIn }) {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ padding: '20px' }}>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <LogoutButton onClick={() => setIsLoggedIn(false)} />
      ) : (
        <LoginButton onClick={() => setIsLoggedIn(true)} />
      )}
      <Greeting isLoggedIn={isLoggedIn} />
    </div>
  );
}

export default App;