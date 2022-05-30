<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String [] movielist = {"타이타닉", "시네마 천국","혹성탈출","킹콩"};
		pageContext.setAttribute("movielist", movielist);
	%>
	
	<c:forEach var="movie" items="${movielist }">
		${movie } ,
	</c:forEach>
</body>
</html>