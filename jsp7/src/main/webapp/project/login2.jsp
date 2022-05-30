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
	<c:if test="${param.ingan==1}">
		<c:redirect url="nomal.jsp"><c:param name="id" value="${param.id }"/></c:redirect>
	</c:if>
	<c:if test="${param.ingan==2}">
		<c:redirect url="nomal2.jsp"><c:param name="id" value="${param.id }"/></c:redirect>
	</c:if>
</body>
</html>