package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBoard {
	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "OSFU";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "update board_info\r\n" +
					"set bi_title=? ,\r\n" +
					"bi_content=? \r\n" +
					"where bi_num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "제목!");
			ps.setString(2, "내용!");
			ps.setInt(3, 7);
			int cnt = ps.executeUpdate(); // insert, update, delete를 사용할때
			if(cnt==1) {
				System.out.println("정상적으로 업데이트 되었습니다.");
			} else {
				System.out.println("오류는 아니지만 업데이트는 되지 않았습니다."); // 해당 num값이 없을 때
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
