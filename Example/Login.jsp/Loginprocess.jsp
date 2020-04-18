<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name=request.getParameter("username");
	request.setAttribute("attname", name);
	
	RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
	rd.forward(request, response);
%>
</body>
</html>