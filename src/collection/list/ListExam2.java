package collection.list;

import java.util.ArrayList;

public class ListExam2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=100;i>=10;i--) { // i-=10 을 넣어도 됨
			if(i%10==0) {
			numList.add(i);
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(numList.get(i));
		}
	}
}
