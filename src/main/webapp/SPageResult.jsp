<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Email</title>
</head>
<body>
<h1>New email</h1>
<p>Your new email is: ${Email.getEmail()}</p>
<a href="SPage.jsp">Enter a new name</a>
<br>
<a href="FPage.jsp">Go to currency converter</a>
</body>
</html>