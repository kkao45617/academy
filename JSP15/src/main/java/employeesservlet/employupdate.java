package employeesservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employDAO.empolyDAO;
import employcontroller.empoly;
import employeesVO.employeesVO;

public class employupdate implements empoly {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		employeesVO vo=new employeesVO();
		String url = "employ/emplyupdate.jsp";
		vo.setId(request.getParameter("id"));
		vo.setPass(request.getParameter("pass"));
		vo.setName(request.getParameter("name"));
		vo.setLev(request.getParameter("lev"));
		vo.setGender(request.getParameter("gender"));
		vo.setPhone(request.getParameter("phone"));
		
		empolyDAO dao= empolyDAO.getinstance();
		dao.update
	}

}
