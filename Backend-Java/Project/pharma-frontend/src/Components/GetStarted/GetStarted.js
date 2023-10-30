  // GetStarted.js
  import React from "react";
  import medicineImage from "./medicine.avif";
  import salesImage from "./sales.avif";
  import updatesImage from "./updates.avif";

  import "./GetStarted.css";

  const GetStarted = () => {
    return (
      <div className="get-started">
        <h2>Welcome to Pharmacy Management System</h2>
        <p>
          Discover the power of our Pharmacy Management System (PMS) - your all-in-one solution for streamlining pharmacy operations, managing medicine requests, and maintaining detailed sales records.
        </p>
  
        <h3>Key Features:</h3>
        <div className="feature">
          <i className="fas fa-medkit icon"></i>
          <p>Effortlessly manage medicine requests to ensure timely availability.</p>
        </div>
        <div className="feature">
          <i className="fas fa-chart-line icon"></i>
          <p>Analyze detailed daily sales records for improved decision-making.</p>
        </div>
        <div className="feature">
          <i className="fas fa-clock icon"></i>
          <p>Stay informed with real-time updates on your pharmacy's operations.</p>
        </div>
  
        <h3>How to Get Started:</h3>
        <ol>
          <li>
            If you have an account, log in with your credentials. If not, please contact the administrator for access.
          </li>
          <li>
            Request medicines for your pharmacy using the 'Medicine Requests' section.
          </li>
          <li>
            Monitor daily sales in the 'Sales Records' section.
          </li>
        </ol>
  
        <div className="images">
          <img src={medicineImage} alt="Medicine Requests" />
          <img src={salesImage} alt="Sales Records" />
          <img src={updatesImage} alt="Real-time Updates" />
        </div>
  
        <p>
          Our Pharmacy Management System is designed to enhance the efficiency of your pharmacy operations. Get started now and experience the benefits of modern pharmacy management.
        </p>
      </div>
    );
  };
  

  export default GetStarted;
