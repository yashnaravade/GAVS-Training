import React, { useState, useEffect } from "react";
import axios from "axios";
import "./ReadMedicine.css"; // Import your CSS file

const MedicineList = () => {
  const [medicines, setMedicines] = useState([]);

  useEffect(() => {
    // Fetch the list of medicines when the component mounts
    axios.get("http://localhost:6969/api/medicines/getmedicine").then((response) => {
      setMedicines(response.data);
    });
  }, []);

  return (
    <div className="medicine-list">
      <h2>Medicine Stock</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Manufacturer Date</th>
            <th>Expiry Date</th>
          </tr>
        </thead>
        <tbody>
          {medicines.map((medicine) => (
            <tr key={medicine.medicineId}>
              <td>{medicine.medicineId}</td>
              <td>{medicine.medicineName}</td>
              <td>{medicine.medicineDescription}</td>
              <td>${medicine.medicinePrice.toFixed(2)}</td>
              <td>{medicine.manufacturerDate}</td>
              <td>{medicine.expiryDate}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default MedicineList;
