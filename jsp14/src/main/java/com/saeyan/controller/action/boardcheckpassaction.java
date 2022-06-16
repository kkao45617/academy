package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.boardDao;
import com.saeyan.dto.boardvo;

public class boardcheckpassaction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="board/boardupdate.jsp";
		
		String num=request.getParameter("num");
		String pass= request.getParameter("pass");
		
		
		boardDao bdao = boardDao.getinstance();
		boardvo vo= bdao.selectoneboardbynum(num);
		if(vo.getPass().equals(pass)) {
			url="board/checksuccess.jsp";
			
		}else {
			url="board/boardcheckpass.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
