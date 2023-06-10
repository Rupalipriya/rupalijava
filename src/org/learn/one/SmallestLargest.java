package org.learn.one;

import java.util.Scanner;

/*
 * Find largest and smallest elements of an array.
 */
public class SmallestLargest {
	Scanner sc = new Scanner(System.in);

	void smalllarge() {

		int a[] = { 2, 4, 5, 8, 9 };
		int sml = a[0], larg = a[0];
		for (int i = 0; i < a.length; i++) {
			if (larg < a[i]) {
				larg = a[i];
			}
			if (sml > a.length) {
				sml = a[i];
			}
		}
		System.out.println("largest " + larg);

		System.out.println("smllest " + sml);
	}

	public static void main(String[] args) {
		SmallestLargest smallestLargest = new SmallestLargest();
		smallestLargest.smalllarge();

	}
}
