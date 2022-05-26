<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.invalidate();
%>
<script>
	alert("로그아웃됏을껄요?");
	location.href="loginfrom.jsp"
</script>
</body>
</html>