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
		Cookie cookie= new Cookie("pwd","");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	%><h3>응 삭제할거야</h3>
	<a href="getcookies.jsp">확인하러 가기</a>
</body>
</html>