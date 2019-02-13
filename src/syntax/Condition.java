package syntax;

public class Condition {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		boolean isEqual = num1==num2;
		if(!isEqual) {
			System.out.println("num1과 num2는 같습니다.");
		} else {
			System.out.println("num1과 num2는 다릅니다.");
		}
		
		// 같다고 물어볼때는 ==
		// 다르다고 물어볼때는 !=
		// ! <-- 부정연산자
		// !true -> false
		// !false -> trud
	}
}
