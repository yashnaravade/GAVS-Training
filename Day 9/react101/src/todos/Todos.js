// import { memo } from "react";

// const Todos = ({ todos }) => {
//   console.log("child render");
//   return (
//     <>
//       <h2>My Todos</h2>
//       {todos.map((todo, index) => {
//         return <p key={index}>{todo}</p>;
//       })}
//     </>
//   );
// };

// export default memo(Todos);

import React from 'react'

function Todos(props) {
    console.log("child render");
      return (
        <>
          <h2>My Todos</h2>
          {props.todos.map(todo=> {
            return `<p>${todo}</p>`;
          })}
        </>
      );
}

export default Todos