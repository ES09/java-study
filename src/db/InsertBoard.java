package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "OSFU";
		String pwd = "12345678";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String title = "게시물제목!!";
			String content = "게시물 내용~~";
			
			String sql = "insert into board_info";
			sql += "(bi_num, bi_title, bi_content, \r\n" +
					"bi_credat, bi_cretim)";
			sql += "values(3,?,?,to_char(sysdate,'YYYYMMDD'), to_char(SYSDATE, 'HH24MISS'))";
			PreparedStatement ps = con.prepareStatement(sql); // 해당 쿼리를 메모리에 올리고
			ps.setString(1, title); // ?에 위의 내용을 추가하기 위한 것
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			System.out.println(cnt);
			if(cnt==1) {
				System.out.println("정상적으로 1개가 입력되었습니다.");
			} else if(cnt==0) {
				System.out.println("입력되지 않았습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
