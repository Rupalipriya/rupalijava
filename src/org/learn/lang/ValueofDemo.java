package org.learn.lang;

public class ValueofDemo {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		Integer j = Integer.valueOf(i);
		System.out.println(j);
		Integer k = Integer.valueOf("20");
		System.out.println(k);
		String s = "Ram";
		Boolean b = Boolean.valueOf(s);
		System.out.println(b);

	}

}
