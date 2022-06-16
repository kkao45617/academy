package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.boardDao;

public class boarddeleteaction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num= request.getParameter("num");
		boardDao bdao = boardDao.getinstance();
		bdao.deleteboard(num);
		
		new boardlistaction().execute(request, response);
	}

}
