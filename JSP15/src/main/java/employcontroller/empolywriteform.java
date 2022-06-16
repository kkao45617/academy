package employcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employDAO.empolyDAO;
import employeesVO.employeesVO;

public class empolywriteform implements empoly {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		employeesVO vo= new employeesVO();
		String url= "employ/employwrite.jsp";
		empolyDAO bao= empolyDAO.getinstance();
		
		RequestDispatcher dispacher = request.getRequestDispatcher(url);
		dispacher.forward(request, response);
		
	}

}
