package org.practice.java;

import java.util.Scanner;

/*
 * WAP in java to reverse an array.
 */
public class ReverseArray {
	Scanner sc = new Scanner(System.in);

	void reversearray1() {

		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("enter the element");
			a[i] = sc.nextInt();

		}

		for (int j = 4; j >=0; j--) {
			System.out.println( "print " +a[j]);
		}

	}

	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.reversearray1();

	}

}
