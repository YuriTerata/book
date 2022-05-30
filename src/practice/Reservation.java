package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns = { "/practice_jsp/reservation" })
public class Reservation extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String date = request.getParameter("date");
		String count = request.getParameter("count");
		String days = request.getParameter("days");
		String room = request.getParameter("room");

		request.setCharacterEncoding("UTF-8");
		String[] option = request.getParameterValues("option");

		Page.header(out);

		out.println("<p>" + name + "様</p>");
		out.println("<p>メールアドレス:" + mail + "</p>");
		out.println("<p>宿泊日:" + date + "</p>");
		out.println("<p>宿泊人数:" + count + "人</p>");
		out.println("<p>宿泊日数:" + days + "日</p>");
		out.println("<p>部屋タイプ:" + room + "</p>");
		out.println("<p>オプション:");
		if (option != null) {
			for (String item : option) {
				out.println("「" + item + "」");

				//拡張for文内での比較する方法
				if(item.equals("3歳以下の子供がいる")){
					out.println("<p>お子様向けに別プランがありますが、そちらを予約しますか？</p>");
				}
			}

			//配列をコレクションに変換してcontainsで探す方法
			if (Arrays.asList(option).contains("3歳以下の子供がいる")) {
				out.println("<p>お子様向けに別プランがありますが、そちらを予約しますか？</p>");
			}

		} else {
			out.println("なし</p>");
		}

		Page.footer(out);

	}

}