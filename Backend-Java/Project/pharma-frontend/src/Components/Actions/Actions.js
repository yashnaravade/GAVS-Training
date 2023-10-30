import React from "react";
import { Link } from "react-router-dom"; // Import Link from React Router
import Footer from "../Footer/Footer";
import "./CardComponent.css";

const Actions = () => {
  return (
    <div className="card-container">

      <Link to="/add-medicine" className="card-link">
        <div className="card">
          <i className="fa fa-plus-circle card-icon" aria-hidden="true"></i>
          <p className="card-text">Add to Stock</p>
          <p className="card-description">
            Add new medicines to your stock inventory.
          </p>
        </div>
      </Link>

      <Link to="/delete-medicine" className="card-link">
        <div className="card">
          <i className="fa fa-minus-circle card-icon" aria-hidden="true"></i>
          <p className="card-text">Remove from Stock</p>
          <p className="card-description">
            Remove medicines from your stock inventory.
          </p>
        </div>
      </Link>


      <Link to="/update-medicine" className="card-link">
        <div className="card">
          <i className="fa fa-pencil-square-o card-icon" aria-hidden="true"></i>
          <p className="card-text">Update Medicine</p>
          <p className="card-description">Update medicine.</p>
        </div>
      </Link>

      <Link to="/read-medicine" className="card-link">
        <div className="card">
          <i className="fa fa-eye card-icon" aria-hidden="true"></i>
          <p className="card-text">View Stock</p>
          <p className="card-description">View your medicine stock inventory.</p>
        </div>
      </Link>


      <Link to="/add-to-order" className="card-link">
        <div className="card">
          <i className="fa fa-cart-plus card-icon" aria-hidden="true"></i>
          <p className="card-text">Add to Order</p>
          <p className="card-description">Add medicines to your order list.</p>
        </div>
      </Link>

      <Link to="/remove-from-order" className="card-link">
        <div className="card">
          <i className="fa fa-cart-arrow-down card-icon" aria-hidden="true"></i>
          <p className="card-text">Remove from Order</p>
          <p className="card-description">
            Remove medicines from your order list.
          </p>
        </div>
      </Link>

      <Link to="/view-cart" className="card-link">
        <div className="card">
          <i className="fa fa-shopping-cart card-icon" aria-hidden="true"></i>
          <p className="card-text">View Cart</p>
          <p className="card-description">View your shopping cart.</p>
        </div>
      </Link>

      <Link to="/view-total" className="card-link">
        <div className="card">
          <i className="fa fa-money card-icon" aria-hidden="true"></i>
          <p className="card-text">View Total</p>
          <p className="card-description">
            View the total amount for your orders.
          </p>
        </div>
      </Link>

      <Link to="/medicine-request-form" className="card-link">
        <div className="card">
          <i className="fa fa-medkit card-icon" aria-hidden="true"></i>
          <p className="card-text">Medicine Requests</p>
          <p className="card-description">
            Form to submit and manage medicine requests.
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

  
      <Link to="/view-orders" className="card-link">
        <div className="card">
          <i className="fa fa-eye card-icon" aria-hidden="true"></i>
          <p className="card-text">View Orders</p>
          <p className="card-description">View your order list.</p>
        </div>
      </Link>

      <Link to="/remove-medicine" className="card-link">
        <div className="card">
          <i className="fa fa-minus-circle card-icon" aria-hidden="true"></i>
          <p className="card-text">Remove Medicine</p>
          <p className="card-description">Remove medicine from the database.</p>
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

export default Actions;
