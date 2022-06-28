<%@page import="com.springbook.diz.board.impl.boardDAO"%>
<%@page import="com.springbook.biz.board.boardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String seq=request.getParameter("seq");
	boardVO vo = new boardVO();
	vo.setSeq(Integer.parseInt(seq));
	boardDAO DAO= new boardDAO();
	DAO.deleteboard(vo);
	response.sendRedirect("getboardlist.jsp");
%>