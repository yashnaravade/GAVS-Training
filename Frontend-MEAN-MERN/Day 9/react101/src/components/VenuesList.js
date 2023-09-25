import React from 'react'

function VenuesList() {
  let venueCount = 6;
  return (
  
<div style={{width: "500px", margin: "auto", height: "240px", backgroundColor: "grey"}}>
    <h1>IPL Venues</h1>
    <ul>
        <li>M. A. Chidambaram Stadium, Chennai</li>
        <li>Wankhede Stadium, Mumbai</li>
        <li>M. Chinnaswamy Stadium, Bengaluru</li>
        <li>Eden Gardens, Kolkata</li>
        <li>Rajiv Gandhi International Cricket Stadium, Hyderabad</li>
        <li>Arun Jaitley Stadium, Delhi</li>
        </ul>

    <h3>Total Venues: {venueCount}</h3>

        

</div>
  )
}

export default VenuesList