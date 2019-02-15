package oop;

public class ClassExam {

	int[] nums = new int[3];
	String str = "abc";
	
	public static void main(String[] args) { 
		ClassExam ce = new ClassExam();
		System.out.println(ce.str);
		ce.str = "바꾸자~";
		System.out.println(ce.str);
		
		for(int i=0;i<3;i++) {
			ce.nums[i] = (i+1)*10;
		}
				
		for(int i=0;i<3;i++) {
			System.out.println(ce.nums[i]);  // 반복문 사용 ce.nums 각 방에 10,20,30 대입
		}
			
	}
}
