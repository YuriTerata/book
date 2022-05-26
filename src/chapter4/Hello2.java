package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/chapter4/hello2" })
public class Hello2 extends HttpServlet {

	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain; charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("Hello!");
		out.println("こんにちは!");
		out.println(new Date());
	}

}
