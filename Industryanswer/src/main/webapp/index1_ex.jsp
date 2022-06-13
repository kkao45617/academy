<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%!
	Connection conn=null;
	PreparedStatement stmt=null;
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String id="scott";
	String pass ="tiger";
	
	String sql="insert into MEMBER_TBL_02 values(?,?,?,?,?,?,?)";
%>
<%
	request.setCharacterEncoding("utf-8");

	try{
		conn=DriverManager.getConnection(url,id,pass);
		
	}catch(Exception e){
		e.printStackTrace();
	}
%>