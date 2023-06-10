package org.learn.one;

import java.util.Scanner;

/*
 * 3.Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
 */
public class CalculationArray {
	Scanner sc = new Scanner(System.in);

	void calculation() {

		int a[] = new int[5];
		int cp = 0, cn = 0, co = 0, ce = 0;
		for (int i = 0; i < a.length; i++) {

			System.out.println("enter the element");
			a[i] = sc.nextInt();

		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] >=0) {
				cp++;

			}

			else {
				cn++;

			}
			if (a[j] % 2 != 0) {
				co++;

			} else {
				ce++;

			}

		}
		System.out.println("positive " + cp);
		System.out.println("negative " + cn);
		System.out.println("odd " + co);
		System.out.println("even " + ce);
	}
	

	public static void main(String[] args) {
		CalculationArray calculationArray = new CalculationArray();
		calculationArray.calculation();

	}

}
