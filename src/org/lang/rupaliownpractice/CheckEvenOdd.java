package org.lang.rupaliownpractice;

/*
 *  WAJP to check if number is even or odd.
 */
public class CheckEvenOdd {
	void checkevenodd(int a) {
		if (a%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		CheckEvenOdd checkEvenOdd = new CheckEvenOdd();
		checkEvenOdd.checkevenodd(12);
	}

}
