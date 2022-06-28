<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.springbook.diz.user.userVO" %>
<%@ page import="com.springbook.diz.user.impl.userDAO"%>

<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	userVO vo = new userVO();
	
	vo.setId(id);
	vo.setPassword(password);
	
	userDAO DAO = new userDAO();
	userVO user = DAO.getuser(vo);
	
	System.out.print(user);
	if(user !=null){
		response.sendRedirect("getboardlist.jsp");
		System.out.println("로그인에 들어왔음");
		
	}else {
		response.sendRedirect("login.jsp");
		System.out.print("안들오옴 들어옴");
	}
%>