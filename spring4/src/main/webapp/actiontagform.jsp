<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="actiontagtest.jsp">
		아이디 : <input type="text" name="userid"><br>
		비번:<input type="text" name="userpwd"><br>
		<input type="radio" name="logincheck" value="user" checked="checked">사용자
		<input type="radio" name="logincheck" value="manager">관리자<br>
		<input type="submit" value="로그인">
		
	</form>
</body>
</html>