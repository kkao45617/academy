package com.springbook.view.board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.springbook.biz.board.boardVO;
import com.springbook.diz.board.impl.boardDAO;

@Controller
public class insertboardcontroller{


	@RequestMapping("/insertboard.do")
	public String insertboard(boardVO vo, boardDAO DAO){
		System.out.println("글 등록 처리");
		DAO.insertboard(vo);
		return "getboardlist.do";
		
	}

}
