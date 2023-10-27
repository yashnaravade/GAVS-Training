<%@ page import ="com.example.demo.entities.OutPatientDepartment" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>OPD Details</h1>
<%OutPatientDepartment opd =(OutPatientDepartment)request.getAttribute("patient"); %>
<h3><li><%=opd.getOpdId() %></li>
<li><%=opd.getOpdName() %></li>
<li><%=opd.getOpdDiagnosis()%></li></h3>
<h3>${patient}</h3>
</body>
</html>