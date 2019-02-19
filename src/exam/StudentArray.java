package exam;

class Student{
	String name;
	int grade;
	String schoolName;
}

public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		for(int i=0; i<10;i++) {
			students[i] = new Student();
			students[i].grade = i+1;
		}
		
		System.out.println(students[6].grade);
		System.out.println(students[7].grade);
		System.out.println(students[8].grade);
		System.out.println(students[9].grade);
		
	}
}


