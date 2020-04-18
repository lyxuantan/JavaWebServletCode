<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h2><%= request.getAttribute("msg")!=null?request.getAttribute("msg"): " " %></h2>
<form action="RegisterController" method = "POST">


Username:<input type="text" name="uname"/>
<br>
<br>
Password:<input type="text" name="pass"/>
<br>
<br>
<input type="submit" value="Register"/>



</form>

</body>
</html>