import React, { useState, useEffect } from "react";
import "./Navigation.css";
import { Link, useNavigate } from "react-router-dom";

const Navigation = () => {
  // Initialize the userRole state with an empty string
  const [userRole, setUserRole] = useState("");
  const navigate = useNavigate();

  // Use useEffect to fetch the user's role from local storage and update the state
  useEffect(() => {
    const role = localStorage.getItem("userRole");
    if (role) {
      setUserRole(role);
    }
  }, []); // The empty dependency array ensures this effect runs once when the component mounts

  const handleLogout = () => {
    // Clear the user's role from local storage
    localStorage.removeItem("userRole");

    // Redirect to the login page
    navigate("/login");
    window.location.reload();
  };

  return (
    <nav>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
      
        <li>
          <Link to="/sales-records">Sales Records</Link>
        </li>
        <li>
          <Link to="/login">Login</Link>
        </li>
        <li>
          {userRole && (
            <span>
              <Link to={userRole === "admin" ? "/admin-home" : "/staff-home"}>
                Actions
              </Link>
              (Role: {userRole})
            </span>
          )}
        </li>
        <li>
          {userRole && (
            <button className="logout-button" onClick={handleLogout}>
              Logout
            </button>
          )}
        </li>
      </ul>
    </nav>
  );
};

export default Navigation;
