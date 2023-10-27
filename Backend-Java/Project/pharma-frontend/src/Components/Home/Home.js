import React from "react";
import "./Home.css";
import DoloIMG from "./dolo.jpg";
import CombiflamIMG from "./combiflam.png";
import BenadrylIMG from "./benadryl.jpg";

const Home = () => {
  return (
    <div className="home">
      <section className="hero">
        <h1>Welcome to the Pharmacy Management System</h1>
        <p>
          Efficiently manage medicine requests and sales records with our
          system.
        </p>
        <button className="cta-button">Get Started</button>
      </section>

      <section className="popular-medicines">
        <h2>Popular Medicines</h2>
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
      </section>

      <section className="key-features">
        <h2>Key Features</h2>
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
        {/* Add more key features as needed */}
      </section>

      <section className="subscription">
        <h2>Subscribe For Updates</h2>
        <form>
          <input type="email" placeholder="Your Email" />
          <button className="cta-button" type="submit">
            Subscribe
          </button>
        </form>
      </section>
    </div>
  );
};

export default Home;
