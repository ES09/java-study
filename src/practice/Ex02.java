package practice;

public class Ex02 { // 오버로딩
	
	int test(int a) {
		return a;
	}
	
	int test(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		System.out.println(ex.test(3));
		System.out.println(ex.test(4,8));
	}

}
