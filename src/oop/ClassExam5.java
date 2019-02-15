package oop;

public class ClassExam5 {
	
	int a = 2;
	
	ClassExam5() {
		System.out.println("난 기본 생성자!");
	} 
	
	ClassExam5(int a) {
		System.out.println("난 기본생성자 아님!");		
	}
	
	public static void main(String[] args) {
		ClassExam5 ce = new ClassExam5(3);
		ce.a = 4;
		System.out.println(ce.a);
	}
	
}
