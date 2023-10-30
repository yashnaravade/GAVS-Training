import React, { useState } from "react";
import axios from "axios";
import "./DeleteMedicine.css"; // Import your CSS file
import Swal from "sweetalert2";

const DeleteMedicine = () => {
  const [medicineId, setMedicineId] = useState(0);
  const [deleteStatus, setDeleteStatus] = useState(""); // To store the delete status message

  const handleDeleteMedicine = () => {
    axios
      .delete(`http://localhost:6969/api/medicines/deletemedicine/${medicineId}`)
      .then((response) => {
        // Handle the response here if needed
        if (response.status === 200) {
          setDeleteStatus("Medicine deleted successfully.");
            Swal.fire({
                title: "Medicine deleted successfully.",
                icon: "success",
                confirmButtonText: "OK",
            });
        } else {
          setDeleteStatus("Failed to delete medicine. Please check the ID.");
            Swal.fire({
                title: "Failed to delete medicine. Please check the ID.",
                icon: "error",
                confirmButtonText: "OK",
            });
        }
      })
      .catch((error) => {
        console.error("An error occurred:", error);
        setDeleteStatus("An error occurred while deleting the medicine.");
            Swal.fire({
                title: "An error occurred while deleting the medicine.",
                icon: "error",
                confirmButtonText: "OK",
            });
      });
  };

  return (
    <div className="delete-medicine">
      <h2>Delete Medicine</h2>
      <div className="form-group">
        <label htmlFor="medicineId">Medicine ID:</label>
        <input
          type="number"
          id="medicineId"
          value={medicineId}
          onChange={(e) => setMedicineId(e.target.value)}
        />
      </div>
      <button onClick={handleDeleteMedicine} className="cta-button">
        Delete Medicine
      </button>
      {deleteStatus && <p>{deleteStatus}</p>}
    </div>
  );
};

export default DeleteMedicine;
