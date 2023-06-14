package org.practice.java;

/*
 * Write a Java program and compute the sum of an integer's digits.
 */
public class IntegerAdd {
	int c;
	int d;

	void sumdidgit(int a) {
		int sum = 0;
		c = a / 10;
		System.out.println(+c);
		d = a % 10;
		System.out.println(+d);
		sum = c + d;

		System.out.println(+ sum);
	}

	public static void main(String[] args) {

		IntegerAdd integerAdd = new IntegerAdd();
		integerAdd.sumdidgit(25);
	}
}
