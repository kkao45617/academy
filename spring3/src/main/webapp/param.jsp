<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>	
	<form action="paramservlet" method="get" name="frm">
		아이디 : <input type="text" name="id" ><br>
		<label for="userid">아이디</label>
		나이 : <input type="password" name="age">
		<input type="submit" value="전송" onclick="return check()">
	</form>

</body>
</html>