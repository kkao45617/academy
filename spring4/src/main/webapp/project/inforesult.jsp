<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");

%>
<html>
<head>
<title>
</title>
</head>
	<body>
		<b>id</b>:<%=request.getParameter("id")%><br>
		<b>password</b>:<%=request.getParameter("pw")%><br>
		<b>자기소개</b><br>
		<%=request.getParameter("desc")%>
	</body>
</html>