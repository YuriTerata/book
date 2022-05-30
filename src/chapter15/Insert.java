package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter15/insert" })
public class Insert extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		try {
			String name = request.getParameter("name");
			int price = Integer.parseInt(request.getParameter("price"));

			//ProductBean入力値をセット
			Product p = new Product();
			p.setName(name);
			p.setPrice(price);

			ProductDAO dao = new ProductDAO();
			//作成したBeanを引数にProductDAOのinsertメソッドを実行
			//結果を受け取る
			int line = dao.insert(p);

			if (line > 0) {
				out.println("追加に成功しました。");
			}

		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}

}
