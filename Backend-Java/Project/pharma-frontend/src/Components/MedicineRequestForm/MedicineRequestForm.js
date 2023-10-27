// MedicineRequestForm.js
import React, { useState } from 'react';
import './MedicineRequestForm.css';

const MedicineRequestForm = () => {
  const [medicineName, setMedicineName] = useState('');
  const [quantity, setQuantity] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    // Handle form submission logic here
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Medicine Request Form</h2>
      <label htmlFor="medicineName">Medicine Name:</label>
      <input
        type="text"
        id="medicineName"
        name="medicineName"
        value={medicineName}
        onChange={(e) => setMedicineName(e.target.value)}
      />
      
      <label htmlFor="quantity">Quantity:</label>
      <input
        type="number"
        id="quantity"
        name="quantity"
        value={quantity}
        onChange={(e) => setQuantity(e.target.value)}
      />
      
      <button type="submit">Submit Request</button>
    </form>
  );
};

export default MedicineRequestForm;
