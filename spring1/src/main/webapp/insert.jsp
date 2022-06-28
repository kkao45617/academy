<%@page import="com.springbook.biz.board.boardVO"%>
<%@page import="com.springbook.diz.board.impl.boardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String title=  request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	boardDAO DAO = new boardDAO();
	boardVO vo = new boardVO();
	
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	
	DAO.insertboard(vo);
	response.sendRedirect("getboardlist.jsp");
%>