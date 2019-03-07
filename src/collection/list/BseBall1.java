package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BseBall1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int ranNum = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			} 
		}

	//	System.out.println("numList : " + numList);

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 , 를 기준으로 3개 입력");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");

		int ball = 0;
		int strike = 0;

		for (int i = 0; i < numStrs.length; i++) {
			if (numList.indexOf(Integer.parseInt(numStrs[i])) != -1) {
				if (i == numList.indexOf(Integer.parseInt(numStrs[i]))) {
					strike++;
				} else {
					ball++;
				}
			}
		}
		if (strike + ball == 0) {
			System.out.println("아웃");
		} else {
			System.out.println(strike + "S, " + ball + "B");

		}
	}
}
