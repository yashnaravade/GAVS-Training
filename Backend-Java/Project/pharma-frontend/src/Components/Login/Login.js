import React, { useState, useEffect } from "react";
import Footer from "../Footer/Footer";
import { Link, useNavigate } from "react-router-dom";
import "./Login.css";
import axios from "axios";
import Swal from "sweetalert2";

const Login = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [loginStatus, setLoginStatus] = useState("");
  const navigate = useNavigate();

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
          // Fetch the user's role after successful login
          axios
            .get(`http://localhost:6969/role/${username}`)
            .then((roleResponse) => {
              const role = roleResponse.data;
              // Save the role to local storage
              localStorage.setItem("userRole", role);

              if (role === "admin") {
                // Display a success SweetAlert for admin
                Swal.fire({
                  icon: "success",
                  title: "Login successful!",
                  text: "Redirecting to admin home in 2 seconds...",
                  showConfirmButton: false,
                  timer: 2000,
                }).then(() => {
                  navigate("/admin-home");
                  window.location.reload();
                });
              } else if (role === "staff") {
                // Display a success SweetAlert for staff
                Swal.fire({
                  icon: "success",
                  title: "Login successful!",
                  text: "Redirecting to staff home in 2 seconds...",
                  showConfirmButton: false,
                  timer: 2000,
                }).then(() => {
                  navigate("/staff-home");
                
                  window.location.reload();
                });
              } else {
                // Handle unexpected roles with an error SweetAlert
                Swal.fire({
                  icon: "error",
                  title: "Invalid role",
                  text: "Please contact support.",
                });
              }
            })
            .catch((error) => {
              console.error("An error occurred while fetching role:", error);
            });
        } else {
          // Display an error SweetAlert for invalid credentials
          Swal.fire({
            icon: "error",
            title: "Login failed",
            text: "Invalid credentials. Please try again.",
          });
        }
      })
      .catch((error) => {
        console.error("An error occurred:", error);
      });

    setUsername("");
    setPassword("");
  };

  return (
    <>
      <br />
      <br />
      <br />
      <br />
      <div className="login-container">
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
          {loginStatus && <p className="login-status">{loginStatus}</p>}
        </form>
        <br />
        <Footer />
      </div>
    </>
  );
};

export default Login;
