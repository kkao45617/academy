package com.saeyan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.controller.action.action;
import com.saeyan.controller.action.actionfactory;


@WebServlet("/boardservlet")
public class boardservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public boardservlet() {

    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command= request.getParameter("command");
		System.out.println("요청 commend : "+command);
		
		actionfactory af = actionfactory.getinstance();
		action action = af.getacAction(command);
		if(action !=null) {
			action.execute(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
