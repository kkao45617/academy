<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="member" class="spring6.memberbean"/>
<jsp:setProperty property="*" name="member"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원의 정보 처리 페이지</h2>
<table>
	<tr>
		<td>이름</td>
		<td><jsp:getProperty property="name" name="member"/>
	</tr>
	<tr>
		<td>아이디</td>
		<td><jsp:getProperty property="userid" name="member"/>
	</tr>
	<tr>
		<td>별명</td>
		<td><jsp:getProperty property="nickname" name="member"/>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><jsp:getProperty property="pwd" name="member"/>
	</tr>
	<tr>
		<td>이메일</td>
		<td><jsp:getProperty property="email" name="member"/>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><jsp:getProperty property="phone" name="member"/>
	</tr>
</table>


</body>
</html>