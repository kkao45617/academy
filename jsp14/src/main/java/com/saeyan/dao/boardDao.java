package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.boardvo;

import util.dbmanager;

public class boardDao {
	private static boardDao instance = new boardDao();
	public static boardDao getinstance() {
		return instance;
	}
	public List<boardvo> selectallboards() {
		List<boardvo> list = new ArrayList<boardvo>();
		String sql= "select * from board order by num desc";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				boardvo vo = new boardvo();
				
				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPass(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setTitle(rs.getString(5));
				vo.setContent(rs.getString(6));
				vo.setReadcount(rs.getInt(7));
				vo.setWritedate(rs.getTimestamp(8));
				list.add(vo);
			}
					
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt, rs);
		}
		return list;
	}
	
	public void insertboard(boardvo vo) {
		String sql="insert into board(num,name,email,pass,title,content) values(board_seq.nextval,?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getPass());
			pstmt.setString(4, vo.getTitle());
			pstmt.setString(5, vo.getContent());
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt);
		}
	}
	public void updatereadcount(String num) {
		String sql="update board set readcount = readcount+1 where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt);
		}
	}
	public boardvo selectoneboardbynum(String num) {
		boardvo vo= new boardvo();
		String sql="select * from board where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
			vo.setNum(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setPass(rs.getString(3));
			vo.setEmail(rs.getString(4));
			vo.setTitle(rs.getString(5));
			vo.setContent(rs.getString(6));
			vo.setReadcount(rs.getInt(7));
			vo.setWritedate(rs.getTimestamp(8));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt,rs);
		}
		
		
		return vo;
	}
	public static boardDao getupdate() {
		
		return null;
	}
	public void updateboar(boardvo vo) {
		String sql="update board set name=?,pass=?,email=?,title=?,content=? where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,vo.getName());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getTitle());
			pstmt.setString(5, vo.getContent());
			
			pstmt.setInt(6, vo.getNum());
			
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt);
		}
		
	}
	public void deleteboard(String num) {
		String sql="DELETE from board where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,num);
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt);
		}
	}
}
