package practice;

public class Daughter extends Mother {

	Daughter(int times, String who){
		this.times = times;
		this.who = who;
	}

	public static void main(String[] args) {
		Daughter d = new Daughter(3,"딸");
		d.eat();
		d.say();	

	}
}
