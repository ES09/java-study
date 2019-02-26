package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog{
	private String name;
	private Integer age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
}	

	public class DogList {
		public static void main(String[] args) {
			List<Dog> dogList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Dog dog = new Dog();
			dog.setName(("멍멍이")+(i+1));
			dog.setAge(i+1);
			dogList.add(dog);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(dogList.get(i).getName() + "의 나이는 " + dogList.get(i).getAge() + "살 이다.");
			
		}
	}	
}
