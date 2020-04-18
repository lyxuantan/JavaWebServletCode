<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


	<script type="text/javascript">
	
		function Display()
		{
			
			var xhttp;
			
			var name = document.myform.name.value;//lấy giá trị từ<input type="text" name="name"/>
			var url = "HomeController?name="+name;
			if(window.XMLHttpRequest)
				{
					xhttp = new XMLHttpRequest();
					
				}
			else
				{
					xhttp = new ActiveXObject("Microsoft.XMLHTTP");
				}
			
			
			xhttp.onreadystatechange = function()
			{
				if (xhttp.readyState == 4)
					{
						var data = xhttp.responseText;
						document.getElementById("ketqua").innerHTML=data;
						
						
					}
			}
			xhttp.open("POST",url,true);//mở kết nối với xmlhttprequest
			xhttp.send();//gửi yêu cầu
			
			
			
		}
	
	
	</script>
</head>
<body>
	<p id="ketqua"></p>
	<form name = "myform">
	
		<input type="text" name="name"/>
		<br>
		<br>
		<input type="button" value="Display" onclick="Display()"/>
		
		
		
		
	<!-- next bai 44 -->
			
	
	
	</form>
</body>
</html>