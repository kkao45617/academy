<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.*" %>
<%!
	Connection conn=null;
	Statement stmt =null;
	ResultSet rs=null;
	
	String url ="jdbc:oracle:thin:@localhost:1521:XE";
	String uid= "scott";
	String pass = "tiger";
	String sql ="select * from employee";
%>
<!DOCTYPE html>
<html>
<head>
<style>
	td{
		background-color: #dcdcdc;
	}
</style>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table class="table" border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>지역</th>
				<th>주민번호</th>
			</tr>
		</thead>
		<tbody>
<%
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,uid,pass);
		stmt=conn.createStatement();
		rs= stmt.executeQuery(sql);
		while(rs.next()){
			out.println("<tr class=table-danger>");
			out.println("<td>"+rs.getString(1)+"</td>");
			out.println("<td>"+rs.getString(2)+"</td>");
			out.println("<td>"+rs.getString(3)+"</td>");
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
			if(rs !=null)rs.close();
			if(stmt !=null) stmt.close();
			if(conn!=null) conn.close();
			}catch(Exception e){
			e.printStackTrace();
		}
	}
		%>
		</tbody>
	</table>
</body>
</html>