<%@page import="com.example.demo.entities.Medicine" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Medicines</title>
</head>
<body>
    <h1>All Medicines</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Medicine ID</th>
                <th>Medicine Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Manufacturer Date</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${medicines}" var="medicine">
                <tr>
                    <td>${medicine.medicineId}</td>
                    <td>${medicine.medicineName}</td>
                    <td>${medicine.medicineDescription}</td>
                    <td>${medicine.medicinePrice}</td>
                    <td>${medicine.manufacturerDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
