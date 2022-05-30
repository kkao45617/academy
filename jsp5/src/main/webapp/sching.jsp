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
		String link=request.getParameter("link");
		
		if(link.equals("naver")){
			response.sendRedirect("https://www.naver.com/");
		}else if(link.equals("daum")){
			response.sendRedirect("https://www.daum.net/");
		}else if(link.equals("nate")){
			response.sendRedirect("https://www.nate.com/");
		}else if(link.equals("google")){
			response.sendRedirect("https://www.google.co.kr/");
		}
	%>
</body>
</html>