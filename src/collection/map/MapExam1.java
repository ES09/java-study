package collection.map;

import java.util.HashMap;

public class MapExam1 {
	
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("이름","홍길동");
		hm.put("이름","홍길동2");
		System.out.println(hm);
		System.out.println(hm.get("이름"));
	}

}
