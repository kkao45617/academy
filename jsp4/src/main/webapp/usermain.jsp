<%@page import="java.net.URLDecoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	사용자 로그인 성공
	<%=URLDecoder.decode(request.getParameter("username"),"UTF-8") %>
	(<%=request.getParameter("userid") %>)님환영합니다
</body>
</html>