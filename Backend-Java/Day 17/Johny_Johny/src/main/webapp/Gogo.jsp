<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate Login</title>
</head>
<body>
<%
String user=request.getParameter("user");
String password=request.getParameter("password");
 
if(user.equals("root") && password.equals("Sandeep@77")) {
	session.setAttribute("user", user);
	%>
	<h2>Welcome to <%=user%></h2><br/>
 
	<a href='/jspdemo/home.jsp'>Click to home page</a>
	<%
	}
else{
	%>
	<h3 style="color:red">Invalid credentials </h3>
	<a href="/jspdemo/Login.html">Click re-login</a>
	<%
	}%>
</body>
</html>