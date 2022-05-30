package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter15/search" })
public class Search extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		try {
			//ブラウザからの入力値取得
			String keyword = request.getParameter("keyword");

			//ProductDAOのインスタンス化
			ProductDAO dao = new ProductDAO();
			//入力値を引数としてsearchメソッドを呼び出し
			List<Product> list = dao.search(keyword);

			for (Product p : list) {
				out.println(p.getId());
				out.println(":");
				out.println(p.getName());
				out.println(":");
				out.println(p.getPrice());
				out.println("<br>");
			}

		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}

}
