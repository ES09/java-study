package exam.ex04;

public class Person implements Action {

	@Override
	public void speek() {
		// TODO Auto-generated method stub
		System.out.println("말하다");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("자다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("먹다");
	}

}
