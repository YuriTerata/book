package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns = { "/chapter4/hello4" })
public class Hello4 extends HttpServlet {

	public void doGet(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
//		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		Page.header(out);

		out.println("<p>Hello!</p>");
		out.println("<p>こんにちは!</p>");
		out.println("<p>" + new Date() + "</p>");

		Page.footer(out);
	}

}
