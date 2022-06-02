package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.memberdao;



@WebServlet("/idcheck.do")
public class idcheckservelt extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		memberdao mdao = memberdao.getinstance();
		int result = mdao.confirmid(userid);
		
		request.setAttribute("userid", userid);
		request.setAttribute("result", result);
		RequestDispatcher dis= request.getRequestDispatcher("member/idcheck.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
