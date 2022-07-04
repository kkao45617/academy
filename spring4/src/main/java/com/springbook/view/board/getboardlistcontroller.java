package com.springbook.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.boardVO;
import com.springbook.diz.board.impl.boardDAO;

@Controller
public class getboardlistcontroller{

	

	@RequestMapping("/getboardlist.do")
	public ModelAndView getboardlist(boardVO vo, boardDAO dao, ModelAndView mav) {
		System.out.println("글목록 검색 처리");
	
		mav.addObject("boardlist",dao.getboardlist(vo));
		mav.setViewName("getboardlist.jsp");
		
		return mav;
		
		//HttpSession session = request.getSession();
		//session.setAttribute("boardlist", boardlist);
		//return "old/getboardlist";
		
		
	}
	
}
