package com.ezen.mybatis;

import java.util.List;

public interface boardmethod {
	
	public boardVO selectone(int id);
	
	public List<boardVO> selectallmember();
	
	public void deleteboard(int id);
	
	public void insertboard(boardVO vo);
	
	public void updateboard(boardVO vo);
	
}
 