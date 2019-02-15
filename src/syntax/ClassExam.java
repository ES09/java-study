package syntax;

public class ClassExam {  // 로드의 시작점(읽어들이는 것)
	int a = 1;
	char c = '1';
	String s = "1";	
	
	void test() { 
		System.out.println("난 ClassExam꺼!");
	}
	
	public static void main(String[] args) {   // 실행의 시작점
		int a = 1;
		ClassExam ce = new ClassExam();
		ce.test();
		System.out.println(ce.a);
	}
}
