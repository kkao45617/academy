<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id="pinksung";
		String pwd="1234";
		String name="성윤정";
		request.setCharacterEncoding("UTF-8");
		if(id.equals(request.getParameter("id"))){
			if(pwd.equals(request.getParameter("pwd"))){
				response.sendRedirect("main.jsp?name="+URLEncoder.encode(name,"utf-8"));
		}else{
			response.sendRedirect("loginfrom.jsp");
		}
		}else{
			response.sendRedirect("loginfrom.jsp");
		}
	%>

</body>
</html>