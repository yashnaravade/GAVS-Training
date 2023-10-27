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
<spring:form action ="/addInp" method ="post" modelAttribute="addInp">
Patient ID<spring:input path="ipdId"/><br/>
Patient Name<spring:input path="ipdName"/><br/>
Patient Diagnosis<spring:input path="ipdDiagnosis"/><br/>
Patient Discharge<spring:input path="ipdDischarged"/><br/>
<input type ="submit" value ="IPD add Patients"/>
</spring:form>
</body>
</html>