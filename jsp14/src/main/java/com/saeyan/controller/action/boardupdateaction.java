package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.boardDao;
import com.saeyan.dto.boardvo;

public class boardupdateaction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boardvo vo=new boardvo();
		
		vo.setNum(Integer.parseInt(request.getParameter("num")));
		vo.setName(request.getParameter("name"));
		vo.setPass(request.getParameter("pass"));
		vo.setEmail(request.getParameter("email"));
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		
		boardDao bdao = boardDao.getinstance();
		bdao.updateboar(vo);
		
		new boardlistaction().execute(request, response);
		
	}

}
