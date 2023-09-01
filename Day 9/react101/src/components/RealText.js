import React from 'react'
import { useState } from 'react'

function RealText() {
    const [name, setName] = useState('');
  return (
    <div>
<br />
<hr />
<h2 style={{"color":"black"}}>Use State</h2>
        <input type="text" value={name} onChange={(e)=>{
            setName(e.target.value)
        }}/>
        <h1 style={{"color":"black"}}>{name}</h1>
    </div>
  )
}

export default RealText