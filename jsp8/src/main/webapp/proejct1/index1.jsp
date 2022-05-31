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
	String sql ="select * from item";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
		<tr>
			<th>상품제목</th>
			<th>가격</th>
			<th>상품설명</th>
		</tr>
		
<%
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,uid,pass);
		stmt=conn.createStatement();
		rs= stmt.executeQuery(sql);
		while(rs.next()){
		%>
		<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		</tr>
		<% 
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
	</table>		
		

</body>
</html>