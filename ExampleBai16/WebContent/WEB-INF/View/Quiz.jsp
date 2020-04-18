<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h4><%= request.getAttribute("msg")!=null?request.getAttribute("msg"):" " %></h4>

<form action="QuizController" method = "POST">
	<c:forEach items = "${listincomplete}" var = "list">
		<p>${list.number}.${list.question}</p><!-- In ra ca hoi socau.cauhoi-->
		<input type="radio" name="ans[${list.number}]" value="A">${list.option1}<!-- In lua chon cau tra loi do vao list -->
		<br>
		<input type="radio" name="ans[${list.number}]" value="B">${list.option2}
		<br>
		<input type="radio" name="ans[${list.number}]" value="C">${list.option3}<!-- In lua chon cau tra loi do vao list -->
		<br>
		<input type="radio" name="ans[${list.number}]" value="D">${list.option4}<!-- In lua chon cau tra loi do vao list -->
		<br>
	</c:forEach>
	<br>
	<input type = "submit" value = "Tabscript"/>
	
	
	
	
	
	
	
	
	
	
</form>
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>