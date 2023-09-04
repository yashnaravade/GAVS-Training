import React, { Component } from 'react';

class ChangePageColor extends Component {
  constructor(props) {
    super(props);
    this.state = { color: "blue" };
  }

  changeColor = (color) => {
    this.setState({ color });
  }

  applyColor = () => {
    const dv = document.getElementById("mnt");
    dv.style.color = this.state.color;
  }

  render() {
    return (
      <div>
        <div id="mnt">
          <b>In Updating phase</b><br /><br />
        </div>
        <select
          value={this.state.color}
          onChange={(e) => this.changeColor(e.target.value)}
        >
          <option value="red">Red</option>
          <option value="yellow">Yellow</option>
          <option value="brown">Brown</option>
          <option value="pink">Pink</option>
          <option value="teal">Teal</option>
        </select>
        <button onClick={this.applyColor}>Apply Color</button>
      </div>
    );
  }
}

export default ChangePageColor;
