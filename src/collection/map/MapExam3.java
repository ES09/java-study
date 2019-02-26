package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
			map.put(1, "가만두지 않겠다.");
			map.put(2, "마지막이다.");
			map.put(3,"음...");
			System.out.println(map);
			
			HashMap<String,Object> cat = new HashMap<>();
			cat.put("name","냥이1");
			cat.put("age",11);
			
						List<HashMap<String,Object>> catList = new ArrayList();
			for(int i=0;i<10;i++) {
				HashMap<String,Object> cat2 = new HashMap<>(); // 공간 만들기
				cat2.put("name","냥이"+(i+1));
				cat2.put("age",(int)(Math.random()*30)+1);
				catList.add(cat2);
			}
			for(int i=0;i<10;i++) {
				// HashMap<String,Object> c = catList.get(i);
				// c = HashMap<"name","냥이~!">; 바뀐다해서 위의 내용이 바뀌는 것이 아님
				System.out.println(catList.get(i));
			}
	}

}
