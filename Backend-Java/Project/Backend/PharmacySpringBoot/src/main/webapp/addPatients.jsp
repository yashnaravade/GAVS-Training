<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="/addopd" method="post" modelAttribute="patients">
Patient Id <spring:input path="opdId"/><br/>
Patient Name<spring:input path="opdName"/><br/>
Patient Diagnosis<spring:input path="opdDiagnosis"/><br/>
<input type="submit" value="Add Patient"/>
</spring:form>
</body>
</html>