package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.memberdao;
import dto.membervo;

@WebServlet("/join.do")
public class joinservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("member/join.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		membervo mvo = new membervo();
		mvo.setName(request.getParameter("name"));
		mvo.setUserid(request.getParameter("userid"));
		mvo.setPwd(request.getParameter("pwd"));
		mvo.setEmail(request.getParameter("email"));
		mvo.setPhone(request.getParameter("phone"));
		mvo.setAdmin(Integer.parseInt(request.getParameter("admin")));
		
		
		memberdao mdao=memberdao.getinstance();
		int result= mdao.insertmember(mvo);
		HttpSession session = request.getSession();
		if(result == 1) {
			
			session.setAttribute("userid", mvo.getUserid());
			request.setAttribute("message", "회원가입 성공했습니다");
		}else if(result==-1) {
			request.setAttribute("message", "회원가입 실패");
		}
		RequestDispatcher dis = request.getRequestDispatcher("member/login.jsp");
		dis.forward(request, response);
	}

}
