package com.saeyan.controller.action;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.boardDao;
import com.saeyan.dto.boardvo;

public class boardlistaction implements action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		String url="board/boarlist.jsp";
		boardDao bdao = boardDao.getinstance();
		
		List<boardvo> boardlist= bdao.selectallboards();
		request.setAttribute("boardlist", boardlist);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
