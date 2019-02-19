package exam.ex01;

public class ObjectArray {
	
	public static void main(String[] args) {
		Object[] objs = new Object[4];
		
		for(int i=0; i<objs.length;i++) {
			if(i%2==0) {
				objs[i] = new StepMother();
			} else {
				objs[i] = new Son();
			}
		}
		
		for(int i=0;i<objs.length;i++) {
		//	((Father)objs[i]).printInfo();
			System.out.println(objs[i] instanceof Father);
			if(objs[i] instanceof Father) {
				((Father)objs[i]).printInfo();
			} else {
				System.out.println("새엄마는 소개가 없어요");
			}
		}
	}

}
