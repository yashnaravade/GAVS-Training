import React from "react";
import { Link } from "react-router-dom"; // Import Link from React Router
import Footer from "../../Footer/Footer";
import "./Staff.css";

const AdminHome = () => {
  return (
    <div className="card-container">
      <Link to="/read-medicine" className="card-link">
        <div className="card">
          <i className="fa fa-eye card-icon" aria-hidden="true"></i>
          <p className="card-text">View Stock</p>
          <p className="card-description">
            View your medicine stock inventory.
          </p>
        </div>
      </Link>

      <Link to="/check-and-delete-expired-medicines" className="card-link">
        <div className="card">
          <i className="fa fa-trash card-icon" aria-hidden="true"></i>
          <p className="card-text">Check and Delete Expired Medicines</p>
          <p className="card-description">
            Check and delete expired medicines.
          </p>
        </div>
      </Link>

      <Link to="/sales-records" className="card-link">
        <div className="card">
          <i className="fa fa-book card-icon" aria-hidden="true"></i>
          <p className="card-text">Sales Records</p>
          <p className="card-description">View your sales records.</p>
        </div>
      </Link>

      <Link to="/add-customer" className="card-link">
        <div className="card">
          <i className="fa fa-user-plus card-icon" aria-hidden="true"></i>
          <p className="card-text">Add Customer</p>
          <p className="card-description">Add new customer to the database.</p>
        </div>
      </Link>

      <Link to="/update-order-by-id" className="card-link">
        <div className="card">
          <i className="fa fa-pencil-square-o card-icon" aria-hidden="true"></i>
          <p className="card-text">Update Order</p>
          <p className="card-description">Update an order by its ID.</p>
        </div>
      </Link>

      <Link to="/order-by-id" className="card-link">
        <div className="card">
          <i className="fa fa-search card-icon" aria-hidden="true"></i>
          <p className="card-text">Search Order</p>
          <p className="card-description">Search an order by its ID.</p>
        </div>
      </Link>

      <Link to="/remove-medicine-from-order" className="card-link">
        <div className="card">
          <i className="fa fa-cart-arrow-down card-icon" aria-hidden="true"></i>
          <p className="card-text">Remove Medicine from Order</p>
          <p className="card-description">Remove medicine from an order.</p>
        </div>
      </Link>

      <Link to="/enroll-medicine-order" className="card-link">
        <div className="card">
          <i className="fa fa-check-square-o card-icon" aria-hidden="true"></i>
          <p className="card-text">Enroll Medicine Order</p>
          <p className="card-description">Enroll medicine order.</p>
        </div>
      </Link>

      <Link to="/medicinebyid" className="card-link">
        <div className="card">
          <i className="fa fa-search card-icon" aria-hidden="true"></i>
          <p className="card-text">Search Medicine</p>
          <p className="card-description">Search medicine by ID.</p>
        </div>
      </Link>

      <br />
      <Footer />
    </div>
  );
};

export default AdminHome;
