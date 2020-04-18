<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Comment Page</title>



<script type="text/javascript">

	function Comment()
	{
		var xhttp;
		var username = document.myform.user.value;
		var content = document.myform.content.value;
		
		var url = "CommentController?content="+content+"&username"+username;
		if(window.XMLHttpRequest)
			{
				xhttp = new XMLHttpRequest();
			}
		else
			{
			xhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
		xhttp.onreadysatachange = function()
		{
			if(xhttp.readyState == 4)
				{
				
				
					var data = xhttp.responseText;
					document.getElementById("mycomment").innerHTML = data;
					
				}
		}
		xhttp.open("POST",url,true);
		xhttp.send();
	}
</script>



</head>
<body>
 <form name="myform">
 
 
 Username:<input type="text" name="username"/>
 <br>
 <br>
 <textarea rows="" cols="" name="content"></textarea>
 <br>
 <br>
 <input type="button" value="Post" onclick="Comment()"/>
 
 
 </form>
 <div id="mycomment"></div>
</body>
</html>