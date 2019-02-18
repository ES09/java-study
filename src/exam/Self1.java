package exam;

class Dog {
	int age;
}
class Cat {
	int age;
}
class Phone {
	String type;
	int use;
	this.type = type;
	this.use = use;
	System.out.println("이 " + this.type + "을 사용한지는 " + this.use + "개월 지났습니다." );
}

public class Self1 {
	public static void main(String[] args) {
		Dog dogs[] = new Dog[5];
		Cat cats[] = new Cat[4];
		Phone phone[] = new Phone[3];
		
		for(int i=0;i<5;i++) {
			dogs[i] = new Dog();
			dogs[i].age = (i+1)*2;
		}
		for(int i=0;i<4;i++) {
			cats[i] = new Cat();
			cats[i].age = i+1;
		}
		
		for(int i=0;i<3;i++) {
			phone[i] = new Phone();
			phone[i].use = (i+1)*5;
			phone[0].type = "갤력시";
			phone[1].type = "아이폰";
			phone[3].type = "LG폰";
		}
		
		System.out.println("이 개는 " + dogs[4].age + "살 입니다.");
		System.out.println("이 고양이는 " + cats[3].age + "살 입니다.");
		phone();
	}

}
