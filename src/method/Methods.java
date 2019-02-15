package method;

public class Methods {
	
	int test(int a, String str) { 
		return 0;
	}
	
	void test(String str, int a) {
		
	}
	
	static String getStr() { 
		return "abc";
	}
	
	static void setStr(String str) {  
		System.out.println(str);
	} 
	
	public static void main(String[] args) {
		setStr("abc");
		String str = getStr();
		System.out.println(str);
	}

}
