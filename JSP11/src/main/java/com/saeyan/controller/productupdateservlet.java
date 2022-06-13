package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.productdao;
import com.saeyan.dto.productvo;


@WebServlet("/productupdate.do")
public class productupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		
		productdao pdao = productdao.getinstance();
		productvo pvo= pdao.selectproductbycode(code);
		request.setAttribute("product", pvo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("product/productupdate.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
