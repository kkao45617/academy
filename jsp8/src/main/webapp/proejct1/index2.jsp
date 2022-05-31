<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="index3.jsp">
		<table>
			<tr>
				<td>상품제목</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="number" name="price"></td>			
			</tr>
			<tr>
				<td>상품설명</td>
				<td><textarea rows="5" cols="10" name="description"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit"  value="전송"></td>
				<td><input type="reset" value="취소">
			</tr>
			
		</table>
	
	</form>
</body>
</html>