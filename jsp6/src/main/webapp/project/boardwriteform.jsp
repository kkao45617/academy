<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.first{
		background-color: gray;
	}
</style>
</head>
<body>
	<form action="boardwrite.jsp">
	<h3>게시판 글쓰기</h3>
		<table border="2">
			<tr>
				<td class="first">작성자</td>
				<td ><input type="text" name="name" size="20"></td>
				
			</tr>
			<tr>
				<td class="first">비밀번호</td>
				<td><input type="password" name="pass" size="20">게시글 수정 삭제시 필요합니다.</td> 
				
			</tr>
			<tr>
				<td class="first">이메일</td>
				<td><input type="text" name="email" size="50"></td>
			</tr>
			<tr>
				<td class="first">글제목</td>
				<td ><input type="text" name="title" size="80"></td>
			</tr>
			<tr >
				<td class="first">글내용</td>
				<td><textarea rows="20" cols="80" name="content"></textarea> </td>
			</tr>	
		</table>
		<input type="submit" value="등록">
		<input type="reset" value="다시 작성">
	</form>
</body>
</html>