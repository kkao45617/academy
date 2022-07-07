package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springbook.biz.board.boardVO;
import com.springbook.biz.utill.sqlsessionfactorybean;

public class boardDAO {
	private SqlSession mybatis;
	
	public boardDAO() {
		mybatis = sqlsessionfactorybean.getsqlsessSessioninatance();
	}
	public void insertboard(boardVO vo) {
		mybatis.insert("boardDAO.insertboard",vo);
		mybatis.commit();
	}
	public void updateboard(boardVO vo) {
		mybatis.update("boardDAO.updateboard",vo);
		mybatis.commit();
	}
	public void deleteboard(boardVO vo) {
		mybatis.delete("boardDAO.deleteboard",vo);
		mybatis.commit();
	}
	public boardVO getboard(boardVO vo) {
		return (boardVO)mybatis.selectOne("boardDAO.getboard",vo);
	}
	public List<boardVO> getboardlist(boardVO vo){
		return mybatis.selectList("boardDAO.getboardlist",vo);
	}
	
}
