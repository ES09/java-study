package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat{
	private String name;
	private int age;
	
	// Alt + C
	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// Alt + G
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Alt + T
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
		
}
public class CatList {
	public static void main(String[] args) {
		Cat cat = new Cat();
		// System.out.println(cat);
		List<Cat> catList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Cat ncat = new Cat();
			ncat.setName("냥이" + (i+1));
			ncat.setAge((int)(Math.random()*30)+1);
			catList.add(ncat);
		}
		for(int i=0;i<10;i++) {
		 System.out.println(catList.get(i)); // toString 설정해서 사용 가능
	}
  }
}	
	

