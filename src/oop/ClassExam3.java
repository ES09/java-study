package oop;

public class ClassExam3 {

	//ClassExam3(){} 이 생략된 것
	
	int num = 1;
	
	void setNum() {
		System.out.println(num);
	}
	
	int getNum() {
		return num;
	}
	
	public static void main(String[] args) {
		ClassExam3 ce = new ClassExam3(); // ClassExam3() 를 기본 생성자라고 함
		System.out.println(ce.num);
		ce.num = 5;
		System.out.println(ce.getNum());
		ce.setNum();
	}
}
