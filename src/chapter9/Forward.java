package chapter9;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/chapter9/forward" })
public class Forward extends HttpServlet {

	public void doGet(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {

		//1文で
		//サーバ内部にあるサーブレットやJSPファイルだけを指定可能
		//forwardメソッド
		request.getRequestDispatcher("forward.jsp").forward(request, response);

		//2文に分けても書ける
		RequestDispatcher rd = request.getRequestDispatcher("forward.jsp");
		rd.forward(request, response);
	}
}
