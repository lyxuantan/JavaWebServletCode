<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h5><%= request.getAttribute("")!=null?request.getAttribute("mess2"):" " %></h5>
	<form action="LoginController" method="POST">
	
	
	<input type="text" name="username"/>
	<br>
	<input type="text" name="password"/>
	<br>
	<input type="submit" value="Login"/>
</body>
</html>