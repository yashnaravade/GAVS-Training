import express from "express";
import mongoose from "mongoose";
import dotenv from "dotenv";

import User from "./models/User.js";

const app = express();
app.use(express.json());

dotenv.config();

const MongoURI = process.env.MongoURI;

console.log(MongoURI);

mongoose
  .connect(MongoURI, { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => {
    console.log("Connected to MongoDB");
  })
  .catch((err) => console.log(err));

app.post("/user", async (req, res) => {
  const { name, password } = req.body;

  const user = new User({
    name: name,
    password: password,
  });

  try {
    await user.save();
    res.send("User saved to database");
    console.log(user);
  } catch (err) {
    console.log(err);
  }
});

app.get("/user", async (req, res) => {
  try {
    const users = await User.find();
    res.send(users);
  } catch (err) {
    console.log(err);
  }
});

app.listen(5000, () => {
  console.log("Server started on port 5000");
});
