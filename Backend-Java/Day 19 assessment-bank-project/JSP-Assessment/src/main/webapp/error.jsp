<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
    <style>
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
            max-width: 600px;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            text-align: center;
        }
        
        h1 {
            color: #ff0000;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Error</h1>
        <p>An error occurred while processing your request.</p>
        <p>Please <a href="login.jsp">return to the login page</a> and try again.</p>
    </div>
</body>
</html>
