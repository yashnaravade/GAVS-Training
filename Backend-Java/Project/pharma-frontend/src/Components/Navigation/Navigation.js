// Navigation.js
import React from "react";
import "./Navigation.css";

const Navigation = () => {
  return (
    <>
      <nav>
        <ul>
          {/* <li><a href="#">Home</a></li>
        <li><a href="#">Medicine Requests</a></li>
        <li><a href="#">Sales Records</a></li>
        Add more navigation links as needed */}
          <li>
            <a href="/">Home</a>
          </li>
          <li>
            <a href="/medicine-request-form">Medicine Requests</a>
          </li>
          <li>
            <a href="/sales-records">Sales Records</a>
          </li>
       <li>
        <a href="/login">Login</a>
       </li>

        </ul>
      </nav>

      <br />
    </>
  );
};

export default Navigation;
