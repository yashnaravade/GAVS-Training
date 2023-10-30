<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medicine Details</title>
</head>
<body>
    <h1>Medicine Details</h1>
    <table>
        <tr>
            <td>Medicine ID:</td>
            <td>${medicine.medicineId}</td>
        </tr>
        <tr>
            <td>Medicine Name:</td>
            <td>${medicine.medicineName}</td>
        </tr>
        <tr>
            <td>Description:</td>
            <td>${medicine.medicineDescription}</td>
        </tr>
        <tr>
            <td>Price:</td>
            <td>${medicine.medicinePrice}</td>
        </tr>
        <tr>
            <td>Manufacturer Date:</td>
            <td>${medicine.manufacturerDate}</td>
        </tr>
    </table>
</body>
</html>
 
