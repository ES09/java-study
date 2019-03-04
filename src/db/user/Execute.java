package db.user;

import java.util.List;
import java.util.Scanner;

import db.board2.BoardInfoVO;

public class Execute {
	public static void main(String[] args) {
		UserService us = new UserService();
		List<BoardInfoVO> biList = null;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 대상을 선택해주세요.");
		System.out.println("1. 검색안함");
		System.out.println("2. 제목");
		System.out.println("3. 내용");
		System.out.println("4. 작성자");
		String cmd = scan.nextLine();
		
		BoardInfoVO bivo = new BoardInfoVO();
		
		if("1".equals(cmd)) {
			biList = us.selectBoard(bivo);
		} else {
			System.out.println("검색할 내용을 입력해주세요.");
			String searchStr = scan.nextLine();
			if("2".equals(cmd)) {
				bivo.setBiTitle(searchStr);
			} else if("3".equals(cmd)) {
				bivo.setBiContent(searchStr);
			} else if("4".equals(cmd)) {
				bivo.setUiName(searchStr);
			}
			biList = us.selectBoard(bivo);
		}
		for(BoardInfoVO bi:biList) {
			System.out.println(bi);
		}
		
	}

}
