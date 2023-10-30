<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Medicine Orders</title>
</head>
<body>
    <h1>Orders for Medicine</h1>
    <table border="1">
        <tr>
            <th>Order ID</th>
            <th>Order Date</th>
            <!-- Add more order-related fields as needed -->
        </tr>
        <c:forEach var="order" items="${orders}">
            <tr>
                <td>${order.orderId}</td>
                <td>${order.orderDate}</td>
                <!-- Display more order-related fields as needed -->
            </tr>
        </c:forEach>
    </table>
    <a href="/medicines">Back to Medicines</a>
</body>
</html>
