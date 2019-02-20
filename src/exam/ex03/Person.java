package exam.ex03;

public class Person {

	public String name;
	public int age;
	
	public static void main(String[] args) {
		Person[] p = new Person[3];
		for(int i=0;i<p.length;i++) {
			p[i] = new Person();
			p[i].name = "이름" + i;
			p[i].age = i;
			
			for(i=0;i<p.length;i++) {
			System.out.println(p[i].name);
			}
			for(i=0;i<p.length;i++) {
				System.out.println(p[i].age);
			}
		}
		
		for(int i=0;i<p.length;i++) {
			
		}
	}
	
}
