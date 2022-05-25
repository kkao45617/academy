<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%request.setCharacterEncoding("UTF-8"); %>
<html>
<body>
	당신의 학력,소속 관심 문야는 다음과 같습니다.
	<%
	String edu=request.getParameter("edu");
	String na=request.getParameter("na");
	String [] likes=request.getParameterValues("like");
	%>
	<b> <%=edu %></b> <b><%=na %></b><br>
	
	<%
		for(int i=0;i<likes.length; i++){
	%>
	
	<b>
	<%=likes[i] %> 
	</b>
	
	<%}%>
</body>
</html>
