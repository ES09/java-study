package osf.db.cons;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUpdateDelete {

	public void insert() {
		
		String sql = "insert into User_Info(ui_num, ui_name, ui_age) ";
			sql += " values((select nvl(max(ui_num),0)+1 from User_Info), ?, ?)"; 
		try {
			PreparedStatement ps = DBConnector.open().prepareStatement(sql);
			ps.setString(1, "ABC");
			ps.setInt(2, 10);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("등록 성공");
			} else if(cnt==0) {
				System.out.println("등록 실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update() {
		
		String sql = "update User_Info set ui_name=?, ui_age=? where ui_num=? ";
		try {
			PreparedStatement ps = DBConnector.open().prepareStatement(sql);
			ps.setString(1, "kes");
			ps.setInt(2, 20);
			ps.setInt(3, 1);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("업데이트 성공");
			} else if(cnt==0) {
				System.out.println("업데이트 실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void delete() {
		
		String sql = "delete from User_Info where ui_num=? ";
		try {
			PreparedStatement ps = DBConnector.open().prepareStatement(sql);
			ps.setInt(1, 1);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("삭제 성공");
			} else if(cnt==0) {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
