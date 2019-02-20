package exam.ex03;

public class MethodExam01 {
	
	public String name = "kes";
	
	public static void setTest(MethodExam01 me1) {
		me1 = new MethodExam01();
	}
	
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		me.name = "kkk";
		MethodExam01.setTest(me);
		System.out.println(me.name);
	}

}
