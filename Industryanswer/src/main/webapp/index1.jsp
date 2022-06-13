<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Decorating.css">
<script type="text/javascript" src="./js/script.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"/>
	
	<h2 class="ju">홈쇼핑 회원 등록</h2>
	<form action="index1_ex.jsp" method="get" name="frm">
	<table border="1" class="table">
			<tr>
				<td>회원번호(자동발생)</td>
				<td> <input type="text" name="custno"></td>
			</tr>
			<tr>
				<td>회원성명</td>
				<td> <input type="text" name="name"> </td>
			</tr>
			<tr>
				<td>회원전화</td>
				<td> <input type="text" name="number"> </td>
			</tr>
			<tr>
				<td>회원주소</td>
				<td> <input type="text" name="address"> </td>
			</tr>
			<tr>
				<td>가입일자</td>
				<td><input type="text" name="date"> </td>
			</tr>
			<tr>
				<td>고객등급(A:vip B:일반 C:직원)</td>
				<td> <input type="text" name="grade"> </td>
			</tr>
			<tr>
				<td>도시코드</td>
				<td> <input type="text" name="code"> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="등록" onclick="return check()">
					<input type="button" value="조회">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>