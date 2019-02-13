package syntax;

public class MultiConditions {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 4;
		
		if(num1==1 && num2==4) {
			System.out.println("오케이!");
		} else {
			System.out.println("뭔가 잘못되었다!");
		}
		
		if(num1==2 || num2==3) {
			System.out.println("오케이");
		} else {
			System.out.println("뭔가 잘못되었다!");
		}
	}
}
