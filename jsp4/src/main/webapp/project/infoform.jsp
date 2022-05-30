<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가입할때 id와 password 및 자기 소개 입력하세요
<form action="inforesult.jsp" method="post">
	id:<input type="text" name="id"><br>
	password :<input type="password" name="pw"><br>
	
	자기소개<br>
	<textarea name="desc" rows="4" cols="50"></textarea><br>
	<input type="submit" value="전송">
	<input type="reset" value="초기화">
</form>
</body>
</html>