package org.learn.lang;

public class AutoboxingDemo {
	void m1(Integer num) {
		System.out.println(num);
	}
	void m2(int num1) {
		System.out.println(num1);
	}
	public static void main(String[] args) {
		AutoboxingDemo at = new AutoboxingDemo();
		at.m1(20);// autoboxing
		Integer i = new Integer(30);
		at.m2(i);// autounboxing
	}
}
