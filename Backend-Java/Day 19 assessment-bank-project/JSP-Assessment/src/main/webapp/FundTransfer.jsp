<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fund Transfer</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        h1 {
            color: #333;
        }
        p {
            font-size: 18px;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
        }
        button {
            background-color: #007BFF;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
        a {
            text-decoration: none;
            color: #007BFF;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Fund Transfer</h1>
        <form action="FundTransferServlet" method="post">
            <input type="text" name="senderUserId" placeholder="Your User ID" required>
            <input type="text" name="receiverUserId" placeholder="Receiver's User ID" required>
            <input type="number" name="amount" placeholder="Enter amount to transfer" step="0.01" required>
            <button type="submit">Transfer</button>
        </form>
        <a href="balance.jsp">Check Balance</a>
        <a href="LogoutServlet">Logout</a>
    </div>
</body>
</html>
