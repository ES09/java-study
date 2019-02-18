package oop.inter;

import oop.inherit.Mother;

public class Daughter extends Mother{

	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println(d.money);
		System.out.println(d.getMoney());
	}
}
