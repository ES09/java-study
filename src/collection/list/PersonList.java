package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

public class PersonList {
	public static void main(String[] args) {
				
		List<Person> pList = new ArrayList<>();
			for(int i=0;i<10;i++) {
				Person p = new Person();
				pList.add(p);
				p.setName("이름" +(i+1));
			}
			for(int i=0;i<10;i++) {
				Person p = pList.get(i);
				System.out.println(p.getName());
			}
	}
}
