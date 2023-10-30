<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Medicine</title>
</head>
<body>
<spring:form action="/edit/${medicine.medicineId}" method="post" modelAttribute="medicine">
    <input type="hidden" name="medicineId" value="${medicine.medicineId}" />
    Medicine Name:
    <spring:select path="medicineName">
        <c:forEach items="${medicines}" var="med">
            <spring:option value="${med.medicineId}">${med.medicineName}</spring:option>
        </c:forEach>
    </spring:select><br/>
    Medicine Description: <spring:input path="medicineDescription" /><br/>
    Medicine Price: <spring:input path="medicinePrice" /><br/>
    Manufacturer Date: <spring:input path="manufacturerDate" type="date" /><br/>
    <input type="submit" value="Save Changes" />
</spring:form>
</body>
</html>
