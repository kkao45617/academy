<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신이 입력한 정보 <hr>
	아이디 <%=request.getParameter("id") %><br>
	
	비번 <%=request.getParameter("pwd") %><br>
	<hr><br>
	당신이 입력한 <br>
	
	아이디 : ${param.id}<br>
	비번: ${param["pwd"]}<br>
</body>
</html>