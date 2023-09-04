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

