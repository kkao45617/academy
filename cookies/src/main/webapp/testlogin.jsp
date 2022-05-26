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
	String id="pinksoung";
	String pwd="1234";
	String name="성윤정";
	
	if(id.equals(request.getParameter("id"))&&
			pwd.equals(request.getParameter("pwd"))){
		session.setAttribute("loginuser", name);
		response.sendRedirect("main.jsp");
	}else{
		response.sendRedirect("loginfrom.jsp");
	}
%>
</body>
</html>