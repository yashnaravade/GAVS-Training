import path from "path";
import express from "express";
import { fileURLToPath } from "url";

const __filename = fileURLToPath(import.meta.url);

const __dirname = path.dirname(__filename);

const app = express();
const port = 3000;

// Middleware to parse JSON and URL-encoded data
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

// Array of allowed users (for simplicity; in a real app, use a database)
const allowedUsers = [
  { username: "user1", password: "password1", name: "User One" },
  { username: "user2", password: "password2", name: "User Two" },
  // Add more users as needed
];

// Serve the HTML form
app.get("/", (req, res) => {
  const indexPath = path.join(__dirname, "./index.html");
  res.sendFile(indexPath);
});

// Handle the POST request
app.post("/login", (req, res) => {
  const { username, password } = req.body;

  // Check if the form was submitted without credentials
  if (!username || !password) {
    return res.status(400).send("Username and password are required"); // Bad Request status
  }

  // Check if the provided username and password match any allowed user
  const user = allowedUsers.find(
    (user) => user.username === username && user.password === password
  );

  if (user) {
    // Successful login
    res.send(`Welcome, ${user.name}!`); // Display user's name
  } else {
    // Invalid login
    res.status(401).send("Invalid username or password"); // Unauthorized status
  }
});

// Start the server
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
