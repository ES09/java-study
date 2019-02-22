package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
 public static void main(String[] args) {
	

	ArrayList<Integer> numList = new ArrayList<>();
	
	for(int i=0;i<6;i++) {
		int num = (int)(Math.random()*45)+1;
		numList.add(num);
		}
	
	Scanner scan = new Scanner(System.in);
	System.out.println(",를 기준으로 숫자 6개 입력");
	String numStr = scan.nextLine();
	System.out.println("입력하신 숫자는 : " + numStr);
	
	String[] numStrs = numStr.split(",");
	
	int anw = 0;
	for(String str:numStrs) {
		if(numList.indexOf(Integer.parseInt(str))!=-1){
			anw++;
		}
		
	System.out.println("numList : " + numList);
	System.out.println("맞춘 갯수는 : " + anw);
	scan.close();
		
	}
}
}

