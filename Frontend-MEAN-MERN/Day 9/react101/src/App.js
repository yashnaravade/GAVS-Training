import "./App.css";
import Teams from "./components/TeamsList";
import VenuesList from "./components/VenuesList";
import RealText from "./components/RealText";
import Todo from "./todos/Todo";

function App() {
  return (
    <div className="App">
      <Teams />
      <VenuesList />
      <RealText />
      <Todo />
    </div>
  );
}

export default App;
