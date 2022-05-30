package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class ProductDAO extends DAO {

	/**
	 * 検索キーワードを使ってProductテーブルのname列を
	 * あいまい検索し、検索した結果をListにして返すメソッド
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public List<Product> search(String keyword) throws Exception {
		List<Product> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"SELECT * FROM product WHERE name LIKE ?");
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();

		//検索結果をProductBeanに格納して
		//1,まぐろ,100 2,サーモン,100...がresultsetに入ってくる
		//resultset(検索結果)をProductBeanに1行ごとに格納 ⇒リストに追加
		//最終的にlistに検索結果が格納された状態になる
		while (rs.next()) {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			list.add(p);
		}

		st.close();
		con.close();

		return list;

	}


	//引数（Product）の値を取得して追加
	public int insert(Product product) throws Exception {

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"INSERT INTO product values(null, ?, ?)");

		st.setString(1, product.getName());
		st.setInt(2, product.getPrice());
		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;
	}
}
