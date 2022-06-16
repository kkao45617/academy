package employDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import employeesVO.employeesVO;
import util.dbmanager;

public class empolyDAO {
	private static empolyDAO instance = new empolyDAO();

	public static empolyDAO getinstance() {
		return instance;
	}

	public List<employeesVO> selectallempoly() {
		List<employeesVO> list = new ArrayList<employeesVO>();
		String sql= "select * from employees order by id desc";
		Connection conn=null;
		PreparedStatement pstmt= null;
		ResultSet rs=null;
		
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				employeesVO vo=new employeesVO();
				
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setLev(rs.getString(4));
				vo.setEnter(rs.getTimestamp(5));
				vo.setGender(rs.getString(6));
				vo.setPhone(rs.getString(7));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt, rs);
		}
		
		
		return list;
	}

	public void insertempoly(employeesVO vo) {
		String sql= "insert into employees values(?,?,?,?,default,?,?)";
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		try {
			conn=dbmanager.getconnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getLev() );
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getPhone());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt);
		}
	}

	public employeesVO selectemployveiw(String id) {
		String sql= "select * from employees where id=?";
		Connection conn=null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		employeesVO vo=new employeesVO();
		
		try {
			conn=dbmanager.getconnection();
			pstmt.setString(1, id);
			pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setLev(rs.getString(4));
				vo.setEnter(rs.getTimestamp(5));
				vo.setGender(rs.getString(6));
				vo.setPhone(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbmanager.closeconnection(conn, pstmt);
		}
		
		return null;
	}
	
	

}
