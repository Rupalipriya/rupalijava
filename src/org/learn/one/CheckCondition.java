package org.learn.one;

//WAJP to check if number is positive or negative 
public class CheckCondition {
	void c1(int a) {
		if (a >= 0) {
			System.out.println("positive ");
		} else {
			System.out.println("negative ");
		}
	}

	public static void main(String[] args) {
		CheckCondition b = new CheckCondition();
		b.c1(0);
	}
}
