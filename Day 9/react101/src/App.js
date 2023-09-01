import "./App.css";
import Teams from "./components/TeamsList";
import VenuesList from "./components/VenuesList";
import RealText from "./components/RealText";

function App() {
  return (
    <div className="App">
      <Teams />
      <VenuesList />
      <RealText />
    </div>
  );
}

export default App;
