package exam.ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class NumGame {
	
	public static ArrayList<Integer> makeNums(){
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0;i<3;i++) {
			int num = (int)(Math.random()*100)+1;
			numList.add(num);
		}
		return numList;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numList = makeNums();
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));
		}
	}
}
