<%@page import="com.example.demo.entities.OutPatientDepartment" %>
<%@ page import="java.util.List" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Patients List</h2> 

<table>
<tr><td>patient id</td><td>patient name</td><td>patient Diagnosis</td>
<c:forEach items="${showPatients}" var="item">
            <tr>
                <td><c:out value="${item.opdId}" /></td>
                <td><c:out value="${item.opdName}" /></td>
                <td><c:out value="${item.opdDiagnosis}" /></td>
            </tr>
</c:forEach>
</table>
</body>
</html>