import React, { useState } from "react";
import "./Register.css";
import axios from "axios";

const Register = () => {
  const [formData, setFormData] = useState({
    username: "",
    email: "",
    password: "",
    confirmPassword: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      // Define the registration data from your state
      const registrationData = {
        username: formData.username,
        email: formData.email,
        password: formData.password,
        // You can add more fields as needed
      };
  
      // Send a POST request to your backend API
      const response = await axios.post("http://localhost:6969/register", registrationData);
  
      if (response.status === 200) {
        console.log("Registration successful"); // You can handle success as needed
       alert("Registration successful for " + formData.username);
      } else {
        console.log("Registration failed. Please check your information."); // Handle registration errors
      alert("Registration failed. Please check your information.");
    }
    } catch (error) {
      console.error("An error occurred:", error);
    }
  };
  

  return (
    <div className="register-container">
      <h2>Register</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="username">Username</label>
          <input
            type="text"
            name="username"
            value={formData.username}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="email">Email</label>
          <input
            type="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password</label>
          <input
            type="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="confirmPassword">Confirm Password</label>
          <input
            type="password"
            name="confirmPassword"
            value={formData.confirmPassword}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Register</button>
      </form>
    </div>
  );
};

export default Register;
