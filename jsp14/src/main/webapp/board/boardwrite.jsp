<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/board.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="wrap" align="center">
	<h1>게시글 등록</h1>
	<form name="frm" method="post" action="boardservlet">
		<input type="hidden" name="command" value="board_write">
		<table>
			<tr>
				<td>작성자</td>
				<td> <input type="text" name="name">*필수</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td> <input type="text" name="pass">*필수 수정 삭제시 필요</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td> <input type="text" name="email"> </td>
			</tr>
			<tr>
				<td>제목</td>
				<td> <input type="text" size="70" name="title">*필수 </td>
			</tr>
			<tr>
				<td>내용</td>
				<td> <textarea cols="70" rows="15" name="content"></textarea> </td>
			</tr>
		</table>
		<br>
		<input type="submit" value="등록" onclick="return boardcheck()">
		<input type="reset" value="다시작성">
		<input type="button" value="목록" onclick="location.href='boardservlet?command=board_list'">
	</form>
</div>


</body>
</html>