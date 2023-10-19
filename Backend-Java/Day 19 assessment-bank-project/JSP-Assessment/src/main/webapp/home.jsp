<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bank Application - Home</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    margin: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    max-width: 400px;
    padding: 20px;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    text-align: center;
}

h1 {
    color: #333;
}

p {
    color: #777;
}

.options ul {
    list-style: none;
    padding: 0;
}

.options li {
    margin: 10px 0;
}

.options a, .options button {
    display: block;
    padding: 10px 20px;
    background-color: #007BFF;
    color: #fff;
    text-decoration: none;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s;
}

.options a:hover, .options button:hover {
    background-color: #0056b3;
}

</style>
</head>
<body>
    <div class="container">
        <h1>Welcome to the Bank Application</h1>
        <p>Logged in as: <%= session.getAttribute("userId") %></p>
        <div class="options">
            <ul> 
                <li><a href="withdraw.jsp">Withdraw Money</a></li>
                <li><a href="deposit.jsp">Deposit Money</a></li>
                <li><a href="FundTransfer.jsp">Fund Transfer</a></li>
                <li><a href="BalanceServlet">Request Balance</a></li>
                 <li><a href="LogoutServlet">Logout</a></li>
            
            </ul>
        </div>
    </div>
</body>

</html>
