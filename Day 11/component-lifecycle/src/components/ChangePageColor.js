import {Component} from 'react';    

class ChangePageColor extends Component {

    constructor(props) {
        super(props);
        this.state = {
            color: 'white'
        }
    }

    changeColor = () => {
        this.setState({
            color: 'red'
        })
    }

    render() {
        return (
            <div style={{backgroundColor: this.state.color}}>
                <button onClick={this.changeColor}>Change Color</button>
            </div>
        )
    }
}

export default ChangePageColor;


// ## 3.2. Mounting

// ### 3.2.1. constructor()

// - constructor() is called before it is mounted.
// - constructor() is the only place where you should assign this.state directly.
// - constructor() is the only place where you can call this.setState() directly.
// - constructor() is the only place where you can set the initial state of the component.
// - constructor() is the only place where you can bind event handlers to the component.
// - constructor() is the only place where you can call super(props).