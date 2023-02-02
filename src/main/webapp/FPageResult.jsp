<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<h1>Results</h1>
<p>Euros: ${Wallet.getEuro()} <br>
Pesos: ${Wallet.getPesos()}<br>
Pound sterling: ${Wallet.getPound()}</p>
<a href="FPage.jsp">Convert another amount</a>
<br>
<a href="SPage.jsp">Go to email creator</a>
</body>
</html>