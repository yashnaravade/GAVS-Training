import ChangePageColor from "./components/ChangePageColor";
import ChangePageColorTwo from "./components/ChangePgColorTwo";
import ChangePageColorThree from "./components/ChangeColorThree";
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";

import "./App.css";

function App() {
  return (
    <div className="App">
      {/* <ChangePageColor /> */}
      {/* <ChangePageColorTwo /> */}
      {/* <ChangePageColorThree />  */}
      <Router>
        <Routes>
          <Route path="/" element={<ChangePageColor />} />
          <Route path="/two" element={<ChangePageColorTwo />} />
          <Route path="/three" element={<ChangePageColorThree />} />
        </Routes>
      </Router>
      
        
    </div>
  );
}

export default App;
