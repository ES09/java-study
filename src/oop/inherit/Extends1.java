package oop.inherit;

class Mother1{    
	int age = 55; 
	String name = "엄마";
	Mother1() {
		System.out.println("난 엄마 생성자!");
	}
	
	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
}

public class Extends1 extends Mother1 {
	Extends1(){
		System.out.println("난 확장생성자!!");
		attack();
	}
	
	public static void main(String[] args) {
		Extends1 m = new Extends1();  
		System.out.println(m.age);
	}

}
