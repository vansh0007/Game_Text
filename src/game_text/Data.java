package game_text;

import java.sql.*;

public class Data {

	private static final Data object = new Data();

	static Connection conn;

	private Data() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/gamedata", "game", "123456");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Data getInstance() {
		return object;
	}

	public static Connection getConnection() throws Exception {

		String sql = "INSERT INTO  data(NAME,DICE_VALUE,TOTAL_VALUE)" + "values(?,?,?)";
		PreparedStatement str = conn.prepareStatement(sql);
		str.setString(1, Player.getName());
		str.setInt(2, Logic.var);
		str.setInt(3, Logic.sum);

		str.executeUpdate();

		return null;

	}

}
