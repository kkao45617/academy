<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="moviewrite.jsp">
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><input type="number" name="price"></td>
		</tr>
		<tr>
			<td>감독</td>
			<td><input type="text" name="director"></td>
		</tr>
		<tr>
			<td>출연배우</td>
			<td><input type="text" name="actor"></td>
		</tr>
		<tr>
			<td>시놉시스</td>
			<td><textarea rows="30" cols="50" name="synopsis"></textarea></td>
		</tr>
	</table>
		장르
		<select name="genre">
			<option>로맨스</option>
			<option>스릴러</option>
			<option>미스터리</option>
			<option>액션</option>
			<option>코미디</option>
			<option>애니메이션</option>
		</select>
		<input type="submit" value="확인">
		<input type="reset" value="취소">
</form>
</body>
</html>