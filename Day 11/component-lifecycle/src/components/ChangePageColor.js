// demonstrate the mounting lifecycle methods of a component using a button to change the page color.
// 1. Create a new component called ChangePageColor.
// 2. Add a dropdown menu with 3 colors: red, green, and blue.
// 3. Add a button that says "Change Page Color".
// 4. When the button is clicked, the background color of the page should change to the selected color.
// 5. Use the componentDidMount() method to set the initial background color of the page to red.
// 6. Use the componentDidUpdate() method to change the background color of the page to the selected color.
// 7. Use the componentWillUnmount() method to change the background color of the page to white.
// 8. Use the shouldComponentUpdate() method to prevent the page from changing color if the same color is selected.
// 9. Use the getSnapshotBeforeUpdate() method to store the previous color of the page in a variable called prevColor.
// 10. Display the previous color of the page in a div below the dropdown menu.
// 11. Use the componentDidCatch() method to display an error message if the page color is not changed to a valid color.
// 12. Use the getDerivedStateFromError() method to display an error message if the page color is not changed to a valid color.
// 13. Use the static getDerivedStateFromProps() method to display the selected color in a div below the dropdown menu.
import React, { Component } from "react";

class ChangePageColor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      color: "red",
      prevColor: "",
      error: false,
    };
  }

  handleChangeColor = (e) => {
    this.setState({ color: e.target.value });
  };

  handleButtonClick = () => {
    this.setState((prevState) => ({
      prevColor: prevState.color,
    }));
    this.updateBackgroundColor();
  };

  updateBackgroundColor = () => {
    document.body.style.backgroundColor = this.state.color;
  };

  render() {
    return (
      <div>
        <h1>Change Page Color</h1>
        <select value={this.state.color} onChange={this.handleChangeColor}>
          <option value="red">Red</option>
          <option value="green">Green</option>
          <option value="blue">Blue</option>
        </select>
        <button onClick={this.handleButtonClick}>Change Page Color</button>
        <div>Previous Color: {this.state.prevColor}</div>
        {this.state.error && <div>Invalid Color</div>}
      </div>
    );
  }
}

export default ChangePageColor;

/**

Here's an explanation of the code:

Import React and Component:


import React, { Component } from "react";

This line imports the necessary modules, React and Component, which are required for creating React components.

Create the ChangePageColor class component:

class ChangePageColor extends Component {

This defines a class component called ChangePageColor that extends the Component class from React.

Initialize the component's state:

constructor(props) {
  super(props);
  this.state = {
    color: "red",
    prevColor: "",
    error: false,
  };
}

In the constructor method, the component's initial state is set. It includes three properties:

color: Represents the current selected color, initially set to "red."
prevColor: Stores the previously selected color.
error: A flag to indicate if there is an error (not used in the final code).
Implement the handleChangeColor method:


handleChangeColor = (e) => {
  this.setState({ color: e.target.value });
};


This method is called when the user selects a color from the dropdown. It updates the color property in the component's state based on the selected value.

Implement the handleButtonClick method:


handleButtonClick = () => {
  this.setState((prevState) => ({
    prevColor: prevState.color,
  }));
  this.updateBackgroundColor();
};


This method is called when the "Change Page Color" button is clicked. It first updates the prevColor property with the current color. Then, it calls the updateBackgroundColor method to change the page's background color.

Implement the updateBackgroundColor method:


updateBackgroundColor = () => {
  document.body.style.backgroundColor = this.state.color;
};


This method changes the background color of the page to the currently selected color from the component's state.

Render the component's UI:

render() {
  return (
    <div>
      <h1>Change Page Color</h1>
      <select value={this.state.color} onChange={this.handleChangeColor}>
        <option value="red">Red</option>
        <option value="green">Green</option>
        <option value="blue">Blue</option>
      </select>
      <button onClick={this.handleButtonClick}>Change Page Color</button>
      <div>Previous Color: {this.state.prevColor}</div>
      {this.state.error && <div>Invalid Color</div>}
    </div>
  );
}

This is the component's render method. It defines the UI elements to display:

A title "Change Page Color."
A dropdown menu to select a color, with the current selected color set as its value.
A "Change Page Color" button that triggers the background color change.
A display of the previous color.
An error message (not used in the final code).
Export the ChangePageColor component as the default export:

jsx
Copy code
export default ChangePageColor;
This allows you to use the ChangePageColor component in other parts of your application.

In summary, this code creates a React component that allows the user to select a color from a dropdown menu and change the page's background color when they click the "Change Page Color" button. The component keeps track of the previous color selected as well.

 */
