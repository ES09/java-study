package db.board;

import java.util.Scanner;

public class Exam {
	
	public static int getBornYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하시오.");
		int bornYear = 2019;
		try {
			bornYear -= Integer.parseInt(scan.nextLine()) -1;
		} catch(Exception e) {
			System.out.println("당신의 나이를 숫자로 입력하시오.");
			bornYear = getBornYear();
		}
		return bornYear;
	}
		
	public static void main(String[] args) {
		int bornYear = getBornYear();
		System.out.println("당신은 " + bornYear + "생 입니다.");
		
}

}
