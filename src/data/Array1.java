package data;

public class Array1 {

	public static void main(String[] args) {
		// 배열은 같은 데이터 타입이라는 전제 조건에서
		// 여러개의 변수를 1개의 변수로 통합할 수 있다.
		// 선언은 데이터타입[] 변수명;
		// 초기화나 대입은 변수명 = new 데이터타입[인덱스수];
		
		int[] nums = new int[10];
		nums[0] = 1;
		nums[9] = 2;
		
		System.out.println(nums.length);
		for(int i=0;i<nums.length;i++) {
			nums[i] = i*10;
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
