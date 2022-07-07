package com.springbook.biz.board;

import java.sql.SQLException;
import java.util.List;

import com.springbook.biz.board.impl.boardDAO;

public class boardserviceclient {
	public static void main(String[] args)throws SQLException {

		boardDAO dao= new boardDAO();
		boardVO vo = new boardVO();
		
		vo.setTitle("mybatis 제목");
		vo.setWriter("홍길동");
		vo.setContent("내용입니다");
		dao.insertboard(vo);
		
		vo.setSerchcondition("title");
		vo.setSerchkeyword("");
		vo.setSeq(10);
		
		List<boardVO> boardlist = dao.getboardlist(vo);
		for(boardVO board:boardlist) {
			System.out.println("--->"+board.toString());
		}
	}
	
}
