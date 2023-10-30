import React, { useEffect, useState } from "react";
import axios from "axios";
import Swal from "sweetalert2";
import "./CheckAndDeleteExpiredMedicines.css";

const CheckAndDeleteExpiredMedicines = () => {
  const [allMedicines, setAllMedicines] = useState([]);
  const [expiredMedicines, setExpiredMedicines] = useState([]);

  useEffect(() => {
    // Fetch all medicines
    axios
      .get("http://localhost:6969/api/medicines/getmedicine")
      .then((response) => {
        const medicines = response.data;
        setAllMedicines(medicines);

        // Check for expired medicines
        const currentDate = new Date();

        const expiredMedicineIds = medicines
          .filter((medicine) => new Date(medicine.expiryDate) < currentDate)
          .map((medicine) => medicine.medicineId);

        setExpiredMedicines(expiredMedicineIds);
      });
  }, []);

  // Delete the expired medicines
  const deleteExpiredMedicines = () => {
    expiredMedicines.forEach((expiredMedicineId) => {
      axios
        .delete(
          `http://localhost:6969/api/medicines/deletemedicine/${expiredMedicineId}`
        )
        .then(() => {
          console.log(`Medicine with ID ${expiredMedicineId} has been deleted.`);
          Swal.fire({
            title: "Expired Medicines Deleted!",
            icon: "success",
            text: `Medicine with ID ${expiredMedicineId} has been deleted.`,
          });
        })
        .catch((error) => {
          console.error(
            `Error deleting medicine with ID ${expiredMedicineId}: ${error}`
          );
        });
    });
  };

  return (
    <div className="container">
      <h2>Expired Medicines</h2>
      <p className="info">
        The following medicines have expired and need to be deleted from the
        database.
      </p>
      <button className="button" onClick={deleteExpiredMedicines}>
        Delete All Expired Medicines
      </button>
      <table className="table">
        <thead>
          <tr>
            <th>Medicine ID</th>
            <th>Medicine Name</th>
            <th>Medicine Price</th>
            <th>Medicine Description</th>
            <th>Medicine Expiry Date</th>
          </tr>
        </thead>
        <tbody>
          {allMedicines
            .filter((medicine) => expiredMedicines.includes(medicine.medicineId)) // This line filters only the expired medicines
            .map((medicine) => (
              <tr key={medicine.medicineId}>
                <td>{medicine.medicineId}</td>
                <td>{medicine.medicineName}</td>
                <td>{medicine.medicinePrice}</td>
                <td>{medicine.medicineDescription}</td>
                <td>{medicine.expiryDate}</td>
              </tr>
            ))}
        </tbody>
      </table>
    </div>
  );
};

export default CheckAndDeleteExpiredMedicines;
