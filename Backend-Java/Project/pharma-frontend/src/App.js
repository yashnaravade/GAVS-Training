// App.js
import React from 'react';
import Header from './Components/Header';
import Navigation from './Components/Navigation';
import MedicineRequestForm from './Components/MedicineRequestForm';

function App() {
  return (
    <div className="App">
      <Header />
      <Navigation />
      <MedicineRequestForm />
      {/* Add other components as needed */}
    </div>
  );
}

export default App;
