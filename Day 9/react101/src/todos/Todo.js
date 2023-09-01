import { useState } from "react";
import ReactDOM from "react-dom/client";
import Todos from "./Todos";

import React from 'react'

export default function Todo() {
    const [count, setCount] = useState(0);
    const [todos, setTodos] = useState(["todo 1", "todo 2"]);
  
    const increment = () => {
      setCount((c) => c + 1);
    };
  
    return (
      <>
        <Todos todos={todos} />
        <hr />
        <div>
          Count: {count}
          <button onClick={increment}>+</button>
        </div>
      </>
    );
}


