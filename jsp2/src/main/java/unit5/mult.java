package unit5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/nextlavel")
public class mult extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		int num1=Integer.parseInt(request.getParameter("a1"));
		int num2=Integer.parseInt(request.getParameter("a2"));
		PrintWriter out = response.getWriter();

		out.println("이재현");
		out.print("<br>");
		out.print("<p>가는 나다 나는 다다");
		out.println("더하기"+(num1+num2));
		out.print("<br>");
		out.println("곱하기"+num1*num2);
		out.print("<br>");
		out.println("나누기"+num1/num2);
		out.print("<br>");
		out.println("첫번쨰"+num1);
		out.print("<br>");
		out.println("두번째"+num2);
	}

}
