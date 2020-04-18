<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success Page</title>
</head>
<body>
<%= session.getAttribute("sessionname")%>
<form action="LogoutController" method="POST">


<input type="submit" value="Thoát">



</form>

</body>
</html>