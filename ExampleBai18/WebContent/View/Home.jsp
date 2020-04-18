<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload single file</h1>
	<form method = "POST" enctype = "multipart/form-data" action="HomeController">
	File to upload: <input type="file" name="file">
	<br>
	<br>
	<input type = "submit" value="Upload single file">
	
	
	
	
	</form>
</body>
</html>