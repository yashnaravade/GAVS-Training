import React, { Component } from "react";

class ChangePageColor extends Component {
  constructor(props) {
    super(props);

    this.state = { color: "blue" };
  }

  changeColor = (color) => {
    this.setState({ color });
  };

  componentDidMount() {
    const dv = document.getElementById("mnt");

    dv.innerHTML += "<br><b><u>Component mounted</u></b>";

    dv.style.color = this.state.color;
  }

  componentDidUpdate() {
    const dv = document.getElementById("mnt");

    dv.innerHTML += "<br><b><i>Component updated</b></i>";

    dv.style.color = this.state.color;
  }

  render() {
    return (
      <div>
        <select
          value={this.state.color}
          onChange={(e) => {
            this.changeColor(e.target.value);
          }}
        >
          <option value="red">Red</option>

          <option value="green">Green</option>

          <option value="brown">Brown</option>

          <option value="pink">Pink</option>

          <option value="teal">Teal</option>
        </select>

        <div id="mnt"></div>
      </div>
    );
  }
}

export default ChangePageColor;
