package oop.inherit;

class People{
	String name;
	People(){
		this("무명");
	}
	People(String name){
		this.name = name;
	}
	void printInfo() {
		System.out.println("이름 : " + name);
	}
}

public class Student extends People {
	int grade;
	Student(int grade) {
		this.grade = grade;
	}
	
	void printInfo() {
		System.out.println("학년 : " + grade);
		System.out.println("이름 : " + name);
	}
	public static void main(String[] args) {
		Student st = new Student(3);
		st.printInfo();
	}
}

