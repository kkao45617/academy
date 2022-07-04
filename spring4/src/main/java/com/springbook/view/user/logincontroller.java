package com.springbook.view.user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.diz.user.userVO;
import com.springbook.diz.user.impl.userDAO;

@Controller
public class logincontroller{

	
	@RequestMapping("login.do")
	public String login(userVO vo, userDAO DAO){
		System.out.println("로그인 처리");
		if(DAO.getuser(vo)!=null) return "getboardlist.do";
		else return "login.jsp";
	}
}


