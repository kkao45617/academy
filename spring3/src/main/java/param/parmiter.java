package param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/paramservlet")
public class parmiter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		int age= Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out=response.getWriter();
		
		
		out.print("<html><doby>");
		out.println("당신이 입력한 정보입니다.");
		out.println("아이디 :");
		out.println(id);
		out.println("나이 :");
		out.println(age);
		
		out.println("<a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		
		out.close();
	}

}
