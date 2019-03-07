package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		
	
	Map<String,String> map = new HashMap<>();
	map.put("이름","홍길동");
	map.put("나이","22");
	map.put("주소","서울");
	map.put("특기","날기");
	
	Iterator<String> it = map.keySet().iterator();
	
	while(it.hasNext()) {
		String key = it.next();
		System.out.println("key : " + key);
		System.out.println("value : " + map.get(key)); 
	// 앞뒤에 무엇이 있는지 알고 더 나올게 없다면 종료하는 시스템
	}
 }
	
}
