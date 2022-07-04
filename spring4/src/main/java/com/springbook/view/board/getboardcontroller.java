package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.boardVO;
import com.springbook.diz.board.impl.boardDAO;

@Controller
public class getboardcontroller{

	

	@RequestMapping("/getboard.do")
	public ModelAndView getboard(boardVO vo, boardDAO DAO, ModelAndView mav){
		System.out.println("글상세조회처리");
		
		mav.addObject("board", DAO.getboard(vo));
		mav.setViewName("getboard.jsp");
		
		return mav;
	}
	
}
