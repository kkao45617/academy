<%@page import="java.sql.Connection"%>
<%@page import="dao.memberdao"%>
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
	memberdao dao = memberdao.getinstance();
	Connection conn=dao.getconnection();
	out.println("db연결 성공일껄?");
%>
</body>
</html>