import Logo from "./logo.jpg";
import "./App.css";
import Teams from "./components/TeamsList";
import VenuesList from "./components/VenuesList";

function App() {
  return (
    <div className="App">
      <Teams />
      <VenuesList />
    </div>
  );
}

export default App;
