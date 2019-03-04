package oop.generic;

import java.util.ArrayList;
import java.util.List;

public class ElementGeneric<E> extends ArrayList<E> {

	public static void main(String[] args) {
		List<String> strList = new ElementGeneric<>();
		strList.add("abc");
		String str = strList.get(0);
	}
}
