<%@page import="com.example.demo.entities.InPatientDepartment" %>
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
<h2>InPatients List</h2> 

<table>
<tr><td>patient_id</td><td>patient_name</td><td>patient_Diagnosis</td><td>Discharged</td></tr>
<c:forEach items="${patients}" var="item">
            <tr>
                <td><c:out value="${item.ipdId}" /></td>
                <td><c:out value="${item.ipdName}" /></td>
                <td><c:out value="${item.ipdDiagnosis}" /></td>
                 <td><c:out value="${item.ipdDischarged}" /></td>
            </tr>
</c:forEach>
</table>
</body>
</html>