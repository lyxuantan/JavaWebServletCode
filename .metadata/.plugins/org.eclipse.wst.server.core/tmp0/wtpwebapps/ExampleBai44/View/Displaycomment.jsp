<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>




</head>
<body>
 <c:forEach items = "${listcomment}" var ="list">
 	<p>${list.username}</p>
 	<br>
 	<br>
 	<p>${list.content}</p>
 </c:forEach>

</body>
</html>