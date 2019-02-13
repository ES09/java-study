package syntax;

public class ThreeSixNine {

	public static void main(String[] args) {
		for(int i=1;i<30;i++) {
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.println("짝");
			} else {
			System.out.println(i);
			}
		}
	}
}
