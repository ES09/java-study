package exam.ex03;

public class Execute {
	
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		
		for(int i=0;i<dogs.length;i++) {
			dogs[i] = new Dog();
			dogs[i].setName("멍멍이" + i);
			dogs[i].setAge(i+1);
		}
		
		for(int i=0;i<dogs.length;i++) {
			System.out.println("개 [" + i + "]의 이름은 " + dogs[i].getName() + " 입니다.");
			System.out.println("개 [" + i + "]의 나이는 " + dogs[i].getAge() + "살 입니다.");
			System.out.println();
		}
				 
	}

}
