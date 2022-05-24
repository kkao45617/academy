<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Calendar"%>
<%!
	String str="안녕하세요!";
	int a=5, b=-5;
	public int abc(int a){
		if(a<0){
			a=-a;
		}
		return a;
	}
	int cnt=0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 주석1 -->
	<%--주석2 --%>
	<%
		//주석3
		int count=0;
		out.println("count :");
		out.print(++count);
		
		out.print(str+"<br>");
		out.print(a+"의 절대값"+abc(a));
		out.print("<br>");
		out.print(b+"의 절대값"+abc(b));
		out.print("<br>");
		out.print("글로벌 cnt"+(++cnt));
		
		Calendar date= Calendar.getInstance();
		SimpleDateFormat today= new SimpleDateFormat("yyyy년  MM월 dd일");
	
	%>
	<%=today.format(date.getTime()) %>	
</body>
</html>