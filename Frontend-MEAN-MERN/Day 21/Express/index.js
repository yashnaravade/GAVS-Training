import express from "express"; // ES6 syntax

const app = express(); // create an express app object. This is the main application object. It has methods for routing HTTP requests, configuring middleware, rendering HTML views, registering a template engine, and modifying application settings that control how the application behaves.

app.get("/", (req, res) => {
  res.send("Hello World");
});

app.listen(3000, () => {
  console.log("Server running on port 3000");
});

function add(a, b) {
  return a + b;
}

app.get("/add", (req, res) => {
    const a = parseInt(req.query.a);
    const b = parseInt(req.query.b);
    const result = add(a, b);
    res.send(result.toString());
    console.log(req);       
    });

// ctrl + c to stop the server
// how should the url look like to add 2 numbers?
// localhost:3000/add?a=1&b=2

// use watch mode to keep the process running 
// node --watch index.js
// or use nodemon 
