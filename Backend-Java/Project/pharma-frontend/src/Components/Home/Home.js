import React from "react";
import Footer from "../Footer/Footer";
import "./Home.css";
import DoloIMG from "./dolo.jpg";
import CombiflamIMG from "./combiflam.png";
import BenadrylIMG from "./benadryl.jpg";
import PharmaBG from "./pharma-bg.jpg"; // Import the background image
import Swal from "sweetalert2";

const Home = () => {
  const handleSubscribe = (e) => {
    e.preventDefault();

    Swal.fire({
      title: "Successfully Subscribed!",
      icon: "success",
      text: "You will now receive updates and news.",
    });
  };

  return (
    <div className="home">
      <section className="hero" style={{ backgroundImage: `url(${PharmaBG})` }}>
        <div className="hero-content">
          <h1>Welcome to the Pharmacy Management System</h1>
          <p>
            Efficiently manage medicine requests and sales records with our
            system.
          </p>
          <a href="/get-started" className="get-started-btn">
            Get Started
          </a>
        </div>
      </section>

      <section className="popular-medicines">
        <h2 className="h2-heading-home">Popular Medicines</h2>
        <div className="medicines">
          <div className="medicine">
            <img src={DoloIMG} alt="Dolo" />
            <p>Dolo 650</p>
          </div>
          <div className="medicine">
            <img src={CombiflamIMG} alt="Combiflam" />
            <p>Combiflam</p>
          </div>
          <div className="medicine">
            <img src={BenadrylIMG} alt="Benadryl" />
            <p>Benadryl</p>
          </div>
        </div>
      </section>

      <section className="key-features">
        <h2 className="h2-heading-home">Key Features</h2>
        <div className="features">
          <div className="feature">
            <i className="fa fa-medkit"></i>
            <p>Efficient Medicine Requests</p>
          </div>
          <div className="feature">
            <i className="fa fa-line-chart"></i>
            <p>Detailed Sales Records</p>
          </div>
          <div className="feature">
            <i className="fa fa-clock-o"></i>
            <p>Real-time Updates</p>
          </div>
          <div className="feature">
            <i className="fa fa-users"></i>
            <p>User-Friendly Interface</p>
          </div>
          {/* Add more key features as needed */}
        </div>
      </section>

      <section className="subscription-form">
        <h2 className="h2-heading-home">Subscribe For Updates</h2>
        <form>
          <input type="email" placeholder="Your Email" />
          <button
            className="cta-button-home"
            type="submit"
            onClick={handleSubscribe}
          >
            Subscribe
          </button>
        </form>
      </section>
      <Footer />
    </div>
  );
};

export default Home;
