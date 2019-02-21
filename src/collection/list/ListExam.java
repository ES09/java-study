package collection.list;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("abc");
						
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.size());
		ArrayList<Integer> numList = new ArrayList();
		numList.add(1); // 공간에 1을 대입한것 = Integer num(1)
	}
}
