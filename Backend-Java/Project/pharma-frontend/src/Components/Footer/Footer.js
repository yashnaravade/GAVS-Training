import React from 'react';
import './Footer.css';

const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-content">
        <div className="footer-section about">
          <h2>About Us</h2>
          <p>
            We are dedicated to providing top-notch healthcare solutions with our Pharmacy Management System. Our mission is to make pharmacy operations efficient and effective.
          </p>
        </div>
        <div className="footer-section contact">
          <h2>Contact Us</h2>
          <ul>
            <li>Email: info@pharmacymanagement.com</li>
            <li>Phone: +1 (123) 456-7890</li>
            <li>Address: 123 Main St, City, Country</li>
          </ul>
        </div>
        <div className="footer-section links">
          <h2>Quick Links</h2>
          <ul>
            <li><a href="#">Privacy Policy</a></li>
            <li><a href="#">Terms of Service</a></li>
            <li><a href="#">FAQs</a></li>
          </ul>
        </div>
      </div>
      <div className="footer-bottom">
        &copy; 2023 Pharmacy Management System
      </div>
    </footer>
  );
};

export default Footer;
