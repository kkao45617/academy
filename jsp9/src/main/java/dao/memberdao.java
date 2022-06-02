package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import dto.membervo;

public class memberdao {
	private memberdao() {
		
	}
	private static memberdao instance = new memberdao();
	public static memberdao getinstance() {
		return instance;
	}
	
	public Connection getconnection() throws Exception {
		
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		return conn;
	}

	public int usercheck(String userid, String pwd) {
		int result =-1;
		String sql = "select pwd from member where userid=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		
		try {
			//디비연결
			conn=getconnection();
			//sql 쿼리 보내기
			pstmt = conn.prepareStatement(sql);
			//쿼리값 세팅
			pstmt.setString(1, userid);
			//세팅된 값 쏘기 
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString("pwd").equals(pwd)&&rs.getString("pwd")!=null) {
					result=1;//회원이 있을경우
				}else {
					result=0;//pwd 불일치
				}
			}else {
				result=-1;//회원이 아니다.
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public membervo getmember(String userid) {
		membervo mvo=null;
		String sql = "select * from member where userid=?";
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
			conn = getconnection();
			pstmt=conn.prepareCall(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mvo = new membervo();
				mvo.setName(rs.getString("name"));
				mvo.setUserid(rs.getString("userid"));
				mvo.setPwd(rs.getString("pwd"));
				mvo.setEmail(rs.getString("email"));
				mvo.setPhone(rs.getString("phone"));
				mvo.setAdmin(rs.getInt("admin"));
			}else {
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mvo;
	}

	public int confirmid(String userid) {
		int result=-1;
		String sql="select userid from member where userid=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		
		try {
			conn=getconnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				result =1;//아이디 중복
			}else {
				result=-1;//아이디 허용
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
