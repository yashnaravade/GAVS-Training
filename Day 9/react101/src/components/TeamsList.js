import React from 'react'

class TeamsList extends React.Component {
 
  render() {
    return (
      <div style={{width: "500px", margin: "auto", height: "240px", backgroundColor: "grey"}}>
        <h1>IPL Teams</h1>
        <ul>
          <li>Chennai Super Kings</li>
          <li>Mumbai Indians</li>
          <li>Royal Challengers Bangalore</li>
          <li>Kolkata Knight Riders</li>
          <li>Sunrisers Hyderabad</li>
          <li>Delhi Capitals</li>
          <li>Punjab Kings</li>
          <li>Rajasthan Royals</li>
        </ul>
      </div>
    )
  }
}

export default TeamsList