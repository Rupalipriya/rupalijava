package org.learn.one;

//WAJP to check if number is even or odd.
public class Mode {
	void m1(int a) {
		if (a % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		Mode ma = new Mode();
		ma.m1(27);
	}
}
