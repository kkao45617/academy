<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="spring6.member2"/>
<jsp:setProperty property="*" name="member"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>안녕 클래오 파트라</h3>
	<table>
		<tr>
			<td>영화 제목</td>
			<td><jsp:getProperty property="title" name="member"/></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><jsp:getProperty property="price" name="member"/> 원</td>
		</tr>
		<tr>
			<td>감독</td>
			<td><jsp:getProperty property="director" name="member"/></td>
		</tr>
		<tr>
			<td>출연배우</td>
			<td><jsp:getProperty property="actor" name="member"/></td>
		</tr>
		<tr>
			<td>시놉시스</td>
			<td><textarea rows="20" cols="30"><jsp:getProperty property="synopsis" name="member"/></textarea></td>
		</tr>
		<tr>
			<td>장르</td>
			<td><jsp:getProperty property="genre" name="member"/></td>
		</tr>
	</table>
</body>
</html>