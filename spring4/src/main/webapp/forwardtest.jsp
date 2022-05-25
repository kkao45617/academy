	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		int age=Integer.parseInt(request.getParameter("age"));
	if(age<=19){
	%>
	<script type="text/javascript">
		alert("19세 미만 출입금지")
		history.go(-1);
	</script>
	<%
	}else{
		request.setAttribute("name", "홍길동");
		RequestDispatcher dis = request.getRequestDispatcher("forwardresult.jsp");
		dis.forward(request, response);
	}
	%>
