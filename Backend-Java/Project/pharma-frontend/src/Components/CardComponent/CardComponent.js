import React from "react";
import { Link } from 'react-router-dom'; // Import Link from React Router
import "./CardComponent.css";

const CardComponent = () => {
  return (
    <div className="card-container">
      <Link to="/add-to-stock" className="card-link">
        <div className="card">
          <i className="fa fa-plus-circle card-icon" aria-hidden="true"></i>
          <p className="card-text">Add to Stock</p>
          <p className="card-description">Add new medicines to your stock inventory.</p>
        </div>
      </Link>

      <Link to="/remove-from-stock" className="card-link">
        <div className="card">
          <i className="fa fa-minus-circle card-icon" aria-hidden="true"></i>
          <p className="card-text">Remove from Stock</p>
          <p className="card-description">Remove medicines from your stock inventory.</p>
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
          <p className="card-description">Remove medicines from your order list.</p>
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
          <p className="card-description">View the total amount for your orders.</p>
        </div>
      </Link>

      <Link to="/fetch-and-view-movies" className="card-link">
        <div className="card">
          <i className="fa fa-list card-icon" aria-hidden="true"></i>
          <p className="card-text">Fetch and View Movies</p>
          <p className="card-description">Browse and watch movies online.</p>
        </div>
      </Link>

      <Link to="/medicine-request-form" className="card-link">
        <div className="card">
          <i className="fa fa-medkit card-icon" aria-hidden="true"></i>
          <p className="card-text">Medicine Requests</p>
          <p className="card-description">Form to submit and manage medicine requests.</p>
        </div>
      </Link>
    </div>
  );
};

export default CardComponent;
