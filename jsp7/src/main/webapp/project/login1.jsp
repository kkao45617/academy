<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login2.jsp" method="get">
		<label>아이디 :</label>
		<input type="text" name="id"><br>
		<label>비번</label>
		<input type="password">		<br>
		
			<input type="radio" name="ingan" value="1">사용자
			<input type="radio" name="ingan" value="2">관리자<br>
		
	<input type="submit" value="로그인">
	</form>
</body>
</html>