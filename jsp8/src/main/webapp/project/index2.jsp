<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="index3.jsp" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>지역</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>주민번호</td>
				<td><input type="text" name="ssn"></td>
			</tr> 
			<tr>
				<td><input type="submit" value="전송"></td>
				<td><input type="reset" value="리셋"></td>
			</tr>
		</table>
	</form>
</body>
</html>