package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class BoardService2 {
	 
	// List를 만들어서 
	public List<BoardInfoVO> selectBoard(){
		
		String sql = "select * from board_info";
		Connection con = DBCon.getCon();
		System.out.println("연결한다");
		
		// 미리 준비 : PreparedStatement
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); // 쿼리를 실행하고 ResultSet에 대입
			List<BoardInfoVO> biList = new ArrayList<>();
			// while문이 동작하는 동안 테이블 row단위로 읽어들인 다음 List에 추가한다.
			while(rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				bi.setBiCretim(rs.getString("bi_cretim"));
				bi.setBiCnt(rs.getInt("bi_cnt"));
				bi.setBiIsactive(rs.getString("bi_isactive"));
				biList.add(bi);
			}
			return biList; // while문에서 읽어들일 다음 내용이 없을 때 false가 되므로 실행 종료 후
						   // biList에 저장된 내용을 출력한다.
 						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// finally는 항상 실행
		finally {
			DBCon.close();
		}
		System.out.println(con);
		return null;
	}
	
	public static void main(String[] args) {
		BoardService2 bs = new BoardService2();
		List<BoardInfoVO> list = bs.selectBoard();
		System.out.println(list);
	}

}
