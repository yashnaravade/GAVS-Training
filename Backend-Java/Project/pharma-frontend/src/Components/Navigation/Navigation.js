// Navigation.js
import React from "react";
import "./Navigation.css";
import { Link } from "react-router-dom";

const Navigation = () => {
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
          <Link to="/Actions">Actions</Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navigation;
