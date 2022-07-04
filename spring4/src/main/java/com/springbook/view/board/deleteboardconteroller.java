package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.boardVO;
import com.springbook.diz.board.impl.boardDAO;

@Controller
public class deleteboardconteroller{

	@RequestMapping("/deleteboard.do")
	public String deleteboard(boardVO vo, boardDAO DAO) {
		System.out.println("글 삭제 처리");
		
		DAO.deleteboard(vo);
		return "getboardlist.do";
	}
	
}
