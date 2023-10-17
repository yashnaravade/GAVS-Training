<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="prd" class="jsp_demo.Product" scope="page" />
<jsp:setProperty property="*" name="prd" />
 
 
<ul>
<li>Prd Id :<jsp:getProperty property="prdId" name="prd"/>
<li>Prd Name :<jsp:getProperty property="prdName" name="prd"/>
<li>Prd Price :<jsp:getProperty property="prdPrice" name="prd"/>
</ul>
</body>
</html>