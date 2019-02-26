package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	
	public static void main(String[] args) {
		// 접속 주소:localhost/xe 포트:1521 ID:osfu pwd:12345678
	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "OSFU";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement(); // 쿼리문 화면 만들기
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql); // 화면에 명령문 입력하기
			while(rs.next()){
				System.out.print(rs.getString("num")+",");
				System.out.print(rs.getString("title")+",");
				System.out.print(rs.getString("reg_date")+",");
				System.out.println(rs.getString("content"));
			}
			System.out.println("연결 성공");
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
