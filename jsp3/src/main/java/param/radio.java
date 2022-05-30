package param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/radioservlet")
public class radio extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String gender = request.getParameter("gender");
		String chk_mail=request.getParameter("chk_mail");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("당신이 입력한 정보입니다.");
		out.print(gender);
		out.println("메일 정보 수신 여부");
		out.println(chk_mail);
		out.println("가입인사 : ");
		out.println(content);
		
		out.println("<a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
	
	}

}
