package data;

public class Array2 {
	
	public static int[] intArray(int size) {
		int[] nums = new int[size];
		for(int i=0;i<size;i++) {
			nums[i] = (int)(Math.random()*20)+1;
		}
		return nums;
	}
	
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
	
	public static int[] extendsSize(int size, int[] array) {
		
		int[] tmp = array;
		array = new int[size + array.length];
		for(int i=0;i<tmp.length;i++) {
			array[i] = tmp[i];
		}
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println(args.length);
		for(String str:args) {
			System.out.println(str);
		}
		int[] nums = intArray(5);
		nums = extendsSize(2,nums);
		printArray(nums);
				
	}

}
