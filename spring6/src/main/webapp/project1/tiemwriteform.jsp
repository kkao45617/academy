<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>정보 입력 폼</h3>
	<form action="itemwrite.jsp">
		<table>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="number" name="price"></td>
			</tr>
			<tr>
				<td>상품설명</td>
				<td><textarea rows="30" cols="50" name="description"></textarea> </td>
			</tr>
		</table>
		<input type="submit" value="전송">
		<input type="reset" value="정말 지울꺼?">
	</form>
</body>
</html>