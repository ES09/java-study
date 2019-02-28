package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
			System.out.println("=======================");
			System.out.println("환영합니다~");
			System.out.println("아래에 아이디를 입력해주세요.");
			System.out.println("=======================");
		
			System.out.println("ID : ");
			String id = scan.nextLine();
			if("OSFU".equals(id)) {
				System.out.println("PWD : ");
				String pwd = scan.nextLine();
				if("12345678".equals(pwd)) {
					BoardService bs = new BoardService();
					System.out.println("환영합니다. OSFU님");
					while(!"q".equals(cmd)) {
					System.out.println("1.게시물 등록");
					System.out.println("2.게시물 삭제");
					System.out.println("3.게시물 조회");
					System.out.println("4.게시물 수정");
					System.out.println("q.종료");
					System.out.println("원하시는 번호를 눌러주세요.");
					System.out.println("번호 : ");
					cmd = scan.nextLine();
					if("3".equals(cmd)) {
						bs.selectBoard();
					} 
					 else if("1".equals(cmd)) {
						System.out.print("제목 : ");
						String title = scan.nextLine();
						System.out.print("내용 : ");
						String content = scan.nextLine();
						bs.insertBoard(title, content);
					}
					 else if("2".equals(cmd)) {
						System.out.println("삭제할 글번호를 입력 : ");
						int num = scan.nextInt();						
						bs.deleteBoard(num);
					}
					 else if("4".equals(cmd)) {
						System.out.println("수정할 글번호를 입력 : ");
						int num = scan.nextInt();
						System.out.println("수정할 제목을 입력 : ");
						String inTitle = scan.nextLine();
						System.out.println("수정할 내용을 입력 : ");
						String inContent = scan.nextLine();
						bs.updateBoard(num, inTitle, inContent);
					} 
					
					}
				}else {
					System.out.println("비밀번호를 잘못 입력하셨습니다.");
				}
			} else {
				System.out.println("아이디를 잘못 입력하셨습니다.");
		}
			
	}while(!"q".equals(cmd));
		
		System.out.println("종료되었습니다.");
}

}
