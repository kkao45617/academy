<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="spring6.member1"/>
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
			<td>상품제목</td>
			<td><jsp:getProperty property="name" name="member"/>
		</tr>
		<tr>
			<td>가격</td>
			<td><jsp:getProperty property="price" name="member"/>
		</tr>
		<tr>
			<td>상품설명</td>
			<td><jsp:getProperty property="description" name="member"/>
		</tr>
	</table>
</body>
</html>