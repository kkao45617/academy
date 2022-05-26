<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int num = Integer.parseInt(request.getParameter("number"));
	int i=0;
	int sum=0;
%>
<h3>1부터 <%=num %>까지 자연수 합 구하기</h3>
<% 
	while(true){
		if(i==num){
		
			out.print("="+sum);
			break;
		}
		i++;
		sum+=i;
		out.print(i);
		if(i<num){
			out.print("+");
		}
	}
%>
</body>
</html>