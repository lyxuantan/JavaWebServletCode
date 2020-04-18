<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<h5><%= request.getAttribute("mess2")!=null?request.getAttribute("mess2"):" " %></h5>
	<form action="LoginController" method="POST">
	
	
	<input type="text" name="username"/>
	<br>
	<input type="text" name="password"/>
	<br>
	<input type="submit" value="Login"/>
	
	
	
	
	</form>

</body>
</html>