package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import dao.memberdao;
import dto.membervo;



@WebServlet("/login.do")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/login.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/login.jsp";
		
		String userid= request.getParameter("userid");
		String pwd= request.getParameter("pwd");
		memberdao mdao = memberdao.getinstance();
		int result = mdao.usercheck(userid,pwd);
		
		if(result==1) {
			
			
			membervo mvo = mdao.getmember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginuser", mvo);
			request.setAttribute("message", "회원가입에 성공하였습니다.");
			url = "main.jsp";
			
			
		}else if(result ==0) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다");
		}else if(result==-1) {
			request.setAttribute("message", "회원가입하세요");
		}
		RequestDispatcher dis= request.getRequestDispatcher(url);
		dis.forward(request, response);
	}

}
