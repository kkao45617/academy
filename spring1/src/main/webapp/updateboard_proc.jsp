<%@page import="com.springbook.biz.board.boardVO"%>
<%@page import="com.springbook.diz.board.impl.boardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String title= request.getParameter("title");
	String content= request.getParameter("content");
	String seq = request.getParameter("seq");
	System.out.print(seq);
	
	
	boardDAO DAO = new boardDAO();
	boardVO vo = new boardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(Integer.parseInt(seq));
	DAO.updateboard(vo);
	response.sendRedirect("getboardlist.jsp");
%>