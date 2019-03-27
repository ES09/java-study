package osf.db.cons;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectUser {

	public static void main(String[] args) {
		String sql = "select ui_num, ui_name, ui_age from User_Info";
		try {
			PreparedStatement ps = DBConnector.open().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Map<String,String>> userList = new ArrayList<>();
			while(rs.next()) {
				Map<String,String> ui = new HashMap<>();
				ui.put("ui_num", rs.getString("ui_num"));
				ui.put("ui_name", rs.getString("ui_name"));
				ui.put("ui_age", rs.getString("ui_age"));
				userList.add(ui);
				}
			System.out.println(userList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnector.close();
		}
	}
}
