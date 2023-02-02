<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to my program</title>
</head>
<body>
<h1>Currency converter</h1>
<form action="convertCurrencyServlet" method="post">
Enter the amount to convert (in dollars):
<input type="text" name="userCurrency" size ="10">
<input type="submit" value="Convert currency"/>
</form>
<br>
<a href="SPage.jsp">Go to email creator</a>
</body>
</html>