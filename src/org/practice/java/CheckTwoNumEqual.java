package org.practice.java;

/*
 * WAJP  to check two number are equal or not .
 */
public class CheckTwoNumEqual {
	void twonumequal(int a, int b) {
		if (a == b) {
			System.out.println("2 num equal");
		} else {
			System.out.println("not equal");
		}

	}

	public static void main(String[] args) {
		CheckTwoNumEqual checkTwoNumEqual = new CheckTwoNumEqual();
		checkTwoNumEqual.twonumequal(2, 2);

	}

}
