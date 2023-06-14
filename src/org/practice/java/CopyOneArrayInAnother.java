package org.practice.java;

import java.util.Scanner;

/*
 * .WAP in java to copy all elements of 1 array into another array.
 */
public class CopyOneArrayInAnother {
	Scanner sc = new Scanner(System.in);

	void copyarray() {
		int a[] = new int[4];
		int a1[] = new int[4];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the element");
			a[i] = sc.nextInt();

			a1[i] = a[i];

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(  + a[i]  +"copy of a array to a1 " + a1[i]);
		}
	}

	public static void main(String[] args) {
		CopyOneArrayInAnother copyOneArrayInAnother = new CopyOneArrayInAnother();
		copyOneArrayInAnother.copyarray();

	}

}
