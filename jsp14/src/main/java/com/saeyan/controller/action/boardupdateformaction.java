package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.boardDao;
import com.saeyan.dto.boardvo;

public class boardupdateformaction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "board/boardupdate.jsp";
		String num= request.getParameter("num");
		boardDao bdao= boardDao.getinstance();
		bdao.updatereadcount(num);
		boardvo vo = bdao.selectoneboardbynum(num);
		
		request.setAttribute("board", vo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
