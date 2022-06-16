<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div id="wrap" align="center">
			<h1>게시글 리스트</h1>
			<table>
				<tr>
					<td colspan="5" style="border: white; text-align: right;">
						<a href="boardservlet?command=board_write_form">게시글 등록</a>
					</td>
				</tr>
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>작성일</td>
					<td>조회</td>
				</tr>
				<c:forEach var="board" items="${boardlist}">
					<tr class="record">
						<td>${board.num}</td>
						<td>
							<a href="boardservlet?command=board_view&num=${board.num}">${board.title}</a>
						</td>
						<td>${board.name}</td>
						<td><fmt:formatDate value="${board.writedate}"/> </td>
						<td>${board.readcount}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
</body>
</html>