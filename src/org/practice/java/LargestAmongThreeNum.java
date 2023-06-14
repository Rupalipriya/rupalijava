package org.practice.java;

/*
 * WAJP to find a largest among 3 numbers.
 */
public class LargestAmongThreeNum {
	void largest(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("largest " + a);

		}
		if (b > a && b > c) {
			System.out.println("largest " + b);
		}
		if (c > a && c > b) {
			System.out.println("largest " + c);
		}
	}

	public static void main(String[] args) {
		LargestAmongThreeNum largestAmongThreeNum = new LargestAmongThreeNum();
		largestAmongThreeNum.largest(23, 12, 98);

	}

}
