package syntax;

public class Condition2 {

	public static void main(String[] args) {
		int a = 4;
//		String str = "a는 3이 아니다."; // else문을 줄일수있다.
//		if(a==3) {
//			str = "a는 3이다.";
//		} 
		String str = (a==3)?"a는 3이다." : "a는 3이 아니다.";
		System.out.println(str);
		
		String s1 = "Dog";
		System.out.println(s1.equalsIgnoreCase("dog"));
		System.out.println(s1.toLowerCase().equals("dog"));
	}
	
}
