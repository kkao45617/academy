<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 전용 페이지</h2>
	<form action="logout.do" method="post">
		<table>
			<tr>
				<!--  <td>안녕하세요 ${loginuser.name}(${loginuser.userid})님</td>-->
				<td>안녕하세요 ${loginuser.name}(${loginuser.userid})님</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				
				<input type="submit" value="로그아웃">
				<input type="button" value="회원정보 변경" onclick="location.href='memberupdate.do?userid=${loginuser.userid}'">
				 </td>
			</tr>
			
			
		</table>
	</form>
</body>
</html>