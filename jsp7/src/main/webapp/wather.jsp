<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
		List<String> seasonlist = new ArrayList<String>();
		seasonlist.add("봄");
		seasonlist.add("여름");
		seasonlist.add("겨울");
		seasonlist.add("가을");
		request.setAttribute("list", seasonlist);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<select name="season">
	<c:forEach var="list" items="${list }">
		<option value="${list}">${list }</option>
	</c:forEach>
</select>
	
	
</body>
</html>