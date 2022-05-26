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
	Cookie ck[]=null;
	//1.클라이언트로부터 cookie[]를 얻어옴
	ck=request.getCookies();
	String name=null;
	if(ck!=null){
		//2.쿠키의 name을 얻어서 username인지 비교하여 같으면
		for(Cookie c : ck){
			name = c.getName();
			if(name.equals("username")){
				name=c.getValue();
				out.print(name);
			}
		}
		
		//3.쿠키의 value을 얻어와 출력
		
		%>
		님 안녕하세요
		<form action="logout.jsp">
			<input type="submit" value="로그아웃">
		</form>
		<% 
	}else{
		%>
		<h2>로그인에 실패하였습니다.</h2>
		<a href="exam5.jsp">되돌아가기</a>
	<%
	}
	%>
</body>
</html>