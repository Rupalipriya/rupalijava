package org.learn.one;

//WAJP to check if number is even or odd.
public class CheckOddEven {
	void m1(int a) {
		if (a % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		CheckOddEven ma = new CheckOddEven();
		ma.m1(2);
	}
}
