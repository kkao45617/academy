<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder" %>
<%
	String userid=request.getParameter("userid");
	String userpwd=request.getParameter("userpwd");
	String logincheck=request.getParameter("logincheck");
	
	if(logincheck.equals("user")){
%>
<jsp:forward page="usermain.jsp">
<jsp:param value='<%=URLEncoder.encode("전고객","UTF-8") %>' name="username" />
</jsp:forward>
<%}else{ %>
<jsp:forward page="managermain.jsp">
<jsp:param value='<%= URLEncoder.encode("성관리","UTF-8") %>' name="username"/>
</jsp:forward>
<%} %>