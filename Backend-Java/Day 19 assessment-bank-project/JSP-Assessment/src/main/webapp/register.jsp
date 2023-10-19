<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create a Bank Account</title>
    
    <style>
    /* register.jsp styles */
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
}

.container {
    width: 450px;
    padding: 20px;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    text-align: center;
}

h1 {
    color: #333;
}

form {
    text-align: left;
}

label {
    display: block;
    margin: 10px 0;
}

input[type="text"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    margin: 5px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
}

input[type="submit"] {
    background-color: #007BFF;
    color: #fff;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #0056b3;
}
    
    </style>
    
</head>
<body>
    <div class="container">
        <h1>Create a Bank Account</h1>
        <form action="RegisterServlet" method="post">
            <label for="userId">User ID:</label>
            <input type="text" name="userId" required><br>
            <label for="password">Password:</label>
            <input type="password" name="password" required><br>
            <!-- Add more account details fields as needed -->
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
