package exam.ex02;

import java.util.Scanner;

public class StringArray {
	
	public String[] strs;
	public StringArray() {
		strs = new String[5];
	}
	
	public static void main(String[] args) {
		StringArray sa = new StringArray();
		System.out.println("5개의 글자를 , 를 기준으로 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(input);
		
		sa.strs = input.split(",");
		System.out.println("검색할 단어를 입력해주세요.");
		String search = scan.nextLine();
		
		for(int i=0;i<sa.strs.length;i++) {
			if(search.equals(sa.strs[i])) {	// sa.strs[i].equals(search)		
			System.out.println("sa.strs[" + i + "]=" + sa.strs[i]);
					
			}
		}
		scan.close();
	}

}
