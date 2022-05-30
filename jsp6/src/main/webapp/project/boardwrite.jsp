<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="member" class="spring6.member"/>
<jsp:setProperty property="*" name="member"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>입력 완료된 정보</h3>
	<table>
		<tr>
			<td>작성자</td>
			<td><jsp:getProperty property="name" name="member"/>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><jsp:getProperty property="pass" name="member"/>
		</tr>
		<tr>
			<td>이메일</td>
			<td><jsp:getProperty property="email" name="member"/>
		</tr>
		<tr>
			<td>글제목</td>
			<td><jsp:getProperty property="title" name="member"/>
		</tr>
		<tr>
			<td>글내용</td>
			<td><jsp:getProperty property="content" name="member"/>
		</tr>
	</table>
	
</body>
</html>