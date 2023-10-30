import React, { useState } from "react";
import Footer from "../Footer/Footer";
import { Link } from "react-router-dom";
import axios from "axios";

const Login = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [loginStatus, setLoginStatus] = useState(""); // To store the login status message

  const handleLogin = (e) => {
    e.preventDefault();

    const user = {
      username: username,
      password: password,
    };

    axios
      .post("http://localhost:6969/login", user)
      .then((response) => {
        if (response.data === "Success") {
          // Update the state to indicate a successful login
          setLoginStatus("Login successful!");
        } else {
          // Update the state to show an error message
          setLoginStatus("Invalid credentials. Please try again.");
        }
      })
      .catch((error) => {
        console.error("An error occurred:", error);
      });

    setUsername("");
    setPassword("");
  };

  return (
    <div className="login">
      <br />
      <form onSubmit={handleLogin}>
        <div className="form-group">
          <label htmlFor="username">Username:</label>
          <input
            type="text"
            id="username"
            name="username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            name="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <button type="submit" className="cta-button">
          Login
        </button>
        
      <p>
        Don't have an account? <Link to="/register">Register</Link>
      </p>
      </form>

      {/* Display the login status */}
      {loginStatus && <p>{loginStatus}</p>}

      <br />
      <Footer />
    </div>
  );
};

export default Login;
