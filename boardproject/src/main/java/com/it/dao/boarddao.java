package com.it.dao;

import java.util.*; //list
import java.sql.*; //connection, prepdaestatment, resultset

public class boarddao {
	private Connection conn=null;
	private PreparedStatement ps = null;
	
	private final String url = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String username="root";
	private final String password="1234";
	
	
	//드라이버등록
	public boarddao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	
	//mysql 연결
	public void getconnection() {
		try {
			
			
			conn=DriverManager.getConnection(url,username,password);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//mysql 해제
	public void disconnection() {
		try {
			if(ps != null)ps.close();
			if(conn != null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//1.디비 목록 출력
	//게시물 정보 한개 : boardvo, 게시물 여러개 : (list)
	public List<boardvo> boardListdata(int page){
		List<boardvo> list = new ArrayList<boardvo>();
		try {
			//1.연결
			getconnection();
			//2.sql문장 작성
			int rowsize =10;
			int start = (rowsize*page)-rowsize;
			
			String sql="select no,subject, name, DATE format(regdate,'%y-%m-%d'),hit from jspboard order by no desc limit ?,?";
			
			//3.전송
			conn.prepareStatement(sql);
			//4.데이터채우기
			ps.setInt(1, start);
			ps.setInt(2, rowsize);
			
			//5 데이터실행
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				boardvo vo = new boardvo();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setDbday(rs.getString(4));
				vo.setHit(rs.getInt(5));
				list.add(vo);
			}
			//6.닫기
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnection();
		}
		
		
		
		return list;
	}
	//2.총페이지()
	public int boardtotalpage() {
		int total=0;
		
		try {
			getconnection();
			String sql = "select ceil(count(*)/10.0 from jspboard";
			ps= conn.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				total=rs.getInt(1);
			}
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnection();
		}
		return total;
	}
	
	
}
