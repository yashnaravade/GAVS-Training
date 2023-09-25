import { Link, Route, BrowserRouter as Router, Routes } from "react-router-dom";
import ChangePageColorThree from "./components/ChangeColorThree";
import ChangePageColor from "./components/ChangePageColor";
import ChangePageColorTwo from "./components/ChangePgColorTwo";

import "./App.css";

function App() {
  // css for links
  const linkStyle = {
    color: "white",
    textDecoration: "none",
    fontSize: "1rem",
    margin: "1rem",
    padding: ".5rem",
    backgroundColor: "black",
    borderRadius: "5px",
    display: "inline-block",
  };

  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<ChangePageColor />} />
          <Route path="/two" element={<ChangePageColorTwo />} />
          <Route path="/three" element={<ChangePageColorThree />} />
        </Routes>

        <Link to="/">
          <a href="/" style={linkStyle}>
            Change Page Color
          </a>
        </Link>
        <br />
        <Link to="/two">
          <a href="/two" style={linkStyle}>
            Change Text Colour
          </a>
        </Link>
        <br />
        <Link to="/three">
          <a href="/three" style={linkStyle}>
            Change Text Colour with Mount
          </a>
        </Link>
      </Router>
    </div>
  );
}

export default App;
