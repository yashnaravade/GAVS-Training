import React, { useState } from "react";
import axios from "axios";
import "./UpdateMedicine.css"; // Import your CSS file
import Swal from "sweetalert2";

const UpdateMedicine = () => {
  const [medicineData, setMedicineData] = useState({
    medicineId: 0,
    medicineName: "",
    medicineDescription: "",
    medicinePrice: 0,
    manufacturerDate: "",
    expiryDate: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setMedicineData({
      ...medicineData,
      [name]: value,
    });
  };

  const handleUpdateMedicine = (e) => {
    e.preventDefault();

    // Get the Medicine ID entered by the user
    const medicineId = medicineData.medicineId;

    axios
      .put(`http://localhost:6969/api/medicines/updatemedicine/${medicineId}`, medicineData)
      .then((response) => {
        // Handle the response here if needed
        console.log("Medicine updated successfully!");
        Swal.fire({
          icon: "success",
          title: "Success!",
          text: "Medicine updated successfully!",
        });
      })
      .catch((error) => {
        console.error("An error occurred:", error);
        Swal.fire({
          icon: "error",
          title: "Oops...",
          text: "Something went wrong!",
        });
      });

    // Clear the form after submission
    setMedicineData({
      medicineId: 0,
      medicineName: "",
      medicineDescription: "",
      medicinePrice: 0,
      manufacturerDate: "",
      expiryDate: "",
    });
  };

  return (
    <>
    <h2 className="main-heading">Update Medicine</h2>
    <div className="update-medicine">
      
      <form onSubmit={handleUpdateMedicine}>
        <div className="form-group">
          <label htmlFor="medicineId">Medicine ID:</label>
          <input
            type="number"
            id="medicineId"
            name="medicineId"
            value={medicineData.medicineId}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="medicineName">Medicine Name:</label>
          <input
            type="text"
            id="medicineName"
            name="medicineName"
            value={medicineData.medicineName}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="medicineDescription">Medicine Description:</label>
          <input
            type="text"
            id="medicineDescription"
            name="medicineDescription"
            value={medicineData.medicineDescription}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="medicinePrice">Medicine Price:</label>
          <input
            type="number"
            id="medicinePrice"
            name="medicinePrice"
            value={medicineData.medicinePrice}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="manufacturerDate">Manufacturer Date:</label>
          <input
            type="date"
            id="manufacturerDate"
            name="manufacturerDate"
            value={medicineData.manufacturerDate}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="expiryDate">Expiry Date:</label>
          <input
            type="date"
            id="expiryDate"
            name="expiryDate"
            value={medicineData.expiryDate}
            onChange={handleChange}
          />
        </div>
        <button type="submit" className="cta-button">
          Update Medicine
        </button>
      </form>
    </div>
    </>
  );
};

export default UpdateMedicine;
