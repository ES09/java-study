package collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("주소","전라도 광주");
		map.put("직업", "도적");
		System.out.println(map);
		Set<String> keys = map.keySet();
		System.out.println(keys.size()); // 위에 선언되어 있는 key들의 개수 출력
		for(String key:keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
