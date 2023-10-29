<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Conversion</title>
    <link rel="stylesheet" type="text/css" href="currStyle.css">
</head>
<body>
    <h1>Currency Conversion</h1>

    <form action="/convert-currency" method="post">
        <label for="fromCurrencyId">From Currency:</label>
        <select name="fromCurrencyId" id="fromCurrencyId">
            <c:forEach items="${currencies}" var="currency">
                <option value="${currency.id}">${currency.name}</option>
            </c:forEach>
        </select>
        <br>
        
        <label for="toCurrencyId">To Currency:</label>
        <select name="toCurrencyId" id="toCurrencyId">
            <c:forEach items="${currencies}" var="currency">
                <option value="${currency.id}">${currency.name}</option>
            </c:forEach>
        </select>
        <br>

        <label for="amount">Amount:</label>
        <input type="text" name="amount" id="amount">
        <br>
        
        <input type="submit" value="Convert">
    </form>

    <c:if test="${result ne null}">
        <p>Conversion Result: ${result}</p>
    </c:if>
</body>
</html>
