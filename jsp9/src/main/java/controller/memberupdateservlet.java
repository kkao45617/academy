package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.memberdao;
import dto.membervo;


@WebServlet("/memberupdate.do")
public class memberupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		
		memberdao mdao= memberdao.getinstance();
		membervo mvo =mdao.getmember(userid);
		request.setAttribute("mvo", mvo);
		
		RequestDispatcher dis = request.getRequestDispatcher("member/memberupdate.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		membervo mvo= new membervo();
		mvo.setUserid(request.getParameter("userid"));
		mvo.setPwd(request.getParameter("pwd"));
		mvo.setPhone(request.getParameter("phone"));
		mvo.setEmail(request.getParameter("email"));
		mvo.setAdmin(Integer.parseInt(request.getParameter("admin")));
		
		
		memberdao mdao = memberdao.getinstance();
		mdao.updatemember(mvo);
		
		response.sendRedirect("login.do");
	}

}
