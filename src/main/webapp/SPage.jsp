<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Email creator</title>
</head>
<body>
<h1>Email creator</h1>
<form action="createEmailServlet" method="post">
Enter your name (first and last):
<input type="text" name="userFName" size="15">
<input type="text" name="userLName" size="15">
<input type="submit" value="Create email"> 
</form>
<br>
<a href="FPage.jsp">Go to currency converter</a>
</body>
</html>