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

	<form action="QuizForward">
		<c:forEach items = "${listcorrectanswer}" var = "listcorrectanswer">
			<c:forEach items = "${listansweruser}" var = "listansweruser">
			
				<c:if test="${listcorrectanswer.number == listansweruser.number}">
					<c:if test="${listcorrectanswer.correctanswer == 'A'}">
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png"> ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					</c:if>
					
					<c:if test="${listcorrectanswer.correctanswer == 'B'}">
						
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png"> ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					
					</c:if>
					<c:if test="${listcorrectanswer.correctanswer == 'C'}">
						
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
								<br>
								   ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					
					</c:if>
					<c:if test="${listcorrectanswer.correctanswer == 'D'}">
						
					
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					</c:if>
				</c:if>	
			</c:forEach>
		</c:forEach>
			<br/>
			<input type = "submit" value = "Again"/>
		</form>
	
	
	
</body>
</html>
<!-- Tư tưởng để hiển thị kết quả khi nhấn tagscrpipt
chạy vòng lặp theo list của danh sách đáp án đúng
chạy vòng lặp theo list của đáp án người dùng
so sánh 
nếu đáp án đúng == A
   đáp án người dùng ==A(Xuất hình correct)
   
   đáp án người dùng ==B(xuất 2 hình:tại đáp án A->Hình màu xanh
   						(tại đáp án người dùng B-> hình màu đỏ)
   						
   						
   đáp án người dùng ==C(xuất 2 hình:tại đáp án A->Hình màu xanh
   						(tại đáp án người dùng B-> hình màu đỏ)
   đáp án người dùng ==D(xuất 2 hình:tại đáp án A->Hình màu xanh
   						(tại đáp án người dùng B-> hình màu đỏ)
nếu đáp án đúng == B
   đáp án người dùng ==A
   đáp án người dùng ==B
   đáp án người dùng ==C
   đáp án người dùng ==D




v.v BCD -->