package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.boardVO;
import com.springbook.diz.board.impl.boardDAO;


public class updateboardcontroller{


	@RequestMapping("/updateboard.do")
	public String updateboard(boardVO vo, boardDAO DAO){
		System.out.println("글 수정 처리");
		DAO.updateboard(vo);
		return "getboardlist.do";
	}

}
