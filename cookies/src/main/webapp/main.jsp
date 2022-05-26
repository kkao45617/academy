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
	if(session.getAttribute("loginuser")==null){
		response.sendRedirect("loginform.jsp");
	}else{
%>
<%=session.getAttribute("loginuser") %>님 안녕하세요
<form action="logout.jsp" method="post">
	<input type="submit"value="로그아웃">
</form>
<% 
	}
%>
</body>
</html>