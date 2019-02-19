package practice;

public class Ex01 { // 오버로딩

	int test(int a) {
		return 6;
	}
	
	String test(String str) {
		return "k";
	}
	
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		System.out.println(ex.test(0));
		System.out.println(ex.test("ab"));
				
	}
}
