<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<jsp:useBean id="member" class="spring6.memberbean"/>
		자바 빈객체 생성후 저장된 정보 출력<br>
		이름 : <jsp:getProperty property="name" name="member"/><br>
		 
		아이디 : <jsp:getProperty property="userid" name="member"/>
		<hr>
		정보 변경한 후 변경된 정보 출력하기<br>
		<jsp:setProperty property="name" name="member" value="전수빈"/>
		<jsp:setProperty property="userid" name="member" value="pinksubin"/>
		
		이름 : <jsp:getProperty property="name" name="member"/><br>
		아이디 :<jsp:getProperty property="userid" name="member"/>
</body>
</html>