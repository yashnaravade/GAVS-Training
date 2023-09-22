import mongoose from "mongoose";

const UserSchema = new mongoose.Schema({
    name: String,
    password: String
});

const User = mongoose.model("User", UserSchema);

export default User;