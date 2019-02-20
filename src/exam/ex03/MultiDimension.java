package exam.ex03;

public class MultiDimension {
	
	public int[][] nums = new int[100][];
	
	public static void main(String[] args) {
		MultiDimension md = new MultiDimension();
		// 다차원 배열의 초기화 시작
		for(int i=0;i<md.nums.length;i++) {
			md.nums[i] = new int[i+1];
			// System.out.println(i + "층의 방갯수 : " + md.nums[i].length);
			} // 다차원 배열의 초기화 끝
		
		int num = 1;
		for(int i=0;i<md.nums.length;i++) {
			for(int j=0;j<md.nums[i].length;j++) {
				md.nums[i][j] = num++; 
			}
		}
			for(int i=0;i<md.nums.length;i++) {
				System.out.print(i + "층 : ");
				for(int j=0;j<md.nums[i].length;j++) {
					System.out.print(md.nums[i][j] + ",");
				}System.out.println();
			}
			
		}
			
	}

