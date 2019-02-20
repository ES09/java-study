package exam.ex03;

public class StaticExam01 {

	public static String name = "하하";
	
	
	public static void main(String[] args) { // static 메모리 생성할 필요가 없다.
		StaticExam01.name = "히히";
		StaticExam01 se01 = new StaticExam01();
		System.out.println(se01.name);
		System.out.println(StaticExam01.name);
	}
}
