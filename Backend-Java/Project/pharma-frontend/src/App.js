// App.js
import React from "react";
import Header from "./Components/Header/Header";
import Navigation from "./Components/Navigation/Navigation";
import MedicineRequestForm from "./Components/MedicineRequestForm/MedicineRequestForm";
import Home from "./Components/Home/Home";
import SalesRecords from "./Components/SalesRecords/SalesRecords";
import Login from "./Components/Login/Login";
import GetStarted from "./Components/GetStarted/GetStarted";
import Actions from "./Components/Actions/Actions";
import Register from "./Components/Register/Register";
import Footer from "./Components/Footer/Footer";
import AddMedicine from "./Components/Medicine/AddMedicine/AddMedicine";
import UpdateMedicine from "./Components/Medicine/UpdateMedicine/UpdateMedicine";
import DeleteMedicine from "./Components/Medicine/DeleteMedicine/DeleteMedicine";
import ReadMedicine from "./Components/Medicine/ReadMedicine/ReadMedicine";
import CheckAndDeleteExpiredMedicines from "./Components/Medicine/CheckAndDeleteExpiredMedicines/CheckAndDeleteExpiredMedicines";


// import "./App.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

function App() {
  return (
    <>
      <Router>
        <Header />
        <Navigation />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/sales-records" element={<SalesRecords />} />
          <Route
            path="/medicine-request-form"
            element={<MedicineRequestForm />}
          />
          <Route path="/login" element={<Login />} />
          <Route path="/get-started" element={<GetStarted />} />
          <Route path="/actions" element={<Actions />} />
          <Route path="/register" element={<Register />} />
          <Route path="/footer" element={<Footer />} />
          <Route path="/add-medicine" element={<AddMedicine />} />
          <Route path="/update-medicine" element={<UpdateMedicine />} />
          <Route path="/delete-medicine" element={< DeleteMedicine />} />
          <Route path="/read-medicine" element={<ReadMedicine />} />
          <Route
            path="/check-and-delete-expired-medicines"
            element={<CheckAndDeleteExpiredMedicines />}
          />

        </Routes>
      </Router>
    </>
  );
}

export default App;
