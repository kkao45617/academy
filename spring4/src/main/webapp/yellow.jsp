<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body bgcolor="yellow">
		<h3>forward 예제 태그 </h3>
		<hr>
		이파일은 yello.jsp입니다<br>
		
		red의 값 :<%= request.getParameter("name") %>
	</body>

	
</html>