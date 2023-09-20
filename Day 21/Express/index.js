import express from "express"; // ES6 syntax

const app = express(); // create an express app object. This is the main application object. It has methods for routing HTTP requests, configuring middleware, rendering HTML views, registering a template engine, and modifying application settings that control how the application behaves.

app.get("/", (req, res) => {
  res.send("Hello World");
});

app.listen(3000, () => {
  console.log("Server running on port 3000");
});

// use watch mode to keep the process running
// node --watch index.js
