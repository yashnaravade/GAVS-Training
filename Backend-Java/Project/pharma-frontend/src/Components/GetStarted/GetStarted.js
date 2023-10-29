// GetStarted.js
import React from "react";
import medicineImage from "./medicine.jpg";
import salesImage from "./sales.jpg";
import updatesImage from "./updates.jpg";

const GetStarted = () => {
  return (
    <div className="get-started">
      <h2>Getting Started with Pharmacy Management System</h2>
      <p>
        Welcome to our Pharmacy Management System (PMS) - your one-stop solution
        for efficient pharmacy operations. With PMS, you can streamline your
        pharmacy's processes, manage medicine requests, and maintain detailed
        sales records.
      </p>

      <h3>Key Features:</h3>
      <div className="feature">
        <i className="fas fa-medkit icon"></i>
        <p>
          Efficient Medicine Requests: Submit and manage medicine requests
          easily to ensure timely availability.
        </p>
      </div>
      <div className="feature">
        <i className="fas fa-chart-line icon"></i>
        <p>
          Detailed Sales Records: View and analyze daily sales records for
          better decision-making.
        </p>
      </div>
      <div className="feature">
        <i className="fas fa-clock icon"></i>
        <p>
          Real-time Updates: Stay up-to-date with real-time updates on your
          pharmacy's operations.
        </p>
      </div>

      <h3>How to Get Started:</h3>
      <ol>
        <li>
          Log In: If you have an account, log in with your credentials. If not,
          please contact the administrator for access.
        </li>
        <li>
          Submit Medicine Requests: Use the 'Medicine Requests' section to
          request medicines for your pharmacy.
        </li>
        <li>
          View Sales Records: Access the 'Sales Records' section to monitor your
          daily sales.
        </li>
      </ol>

      <div className="images">
        <img src={medicineImage} alt="Medicine Requests" />
        <img src={salesImage} alt="Sales Records" />
        <img src={updatesImage} alt="Real-time Updates" />
      </div>

      <p>
        Our Pharmacy Management System is designed to make your pharmacy
        operations more efficient and effective. Get started now and experience
        the benefits of modern pharmacy management.
      </p>
    </div>
  );
};

export default GetStarted;
