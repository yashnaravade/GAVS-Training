<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Medicine</title>
</head>
<body>
    <h1>Add Medicine</h1>
    <spring:form action="/addmedicine" modelAttribute="medicines" method="post">
        Medicine Name : <spring:input path="medicineName" /><br/>
        Medicine Description: <spring:input path="medicineDescription" /><br/>
        Medicine Price: <spring:input path="medicinePrice" /><br/>
        Manufacturer Date: <spring:input path="manufacturerDate" type="date"/><br/>
        <input type="submit" value="Add Medicine" />
    </spring:form>
</body>
</html>
