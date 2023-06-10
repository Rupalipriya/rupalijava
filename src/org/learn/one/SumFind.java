package org.learn.one;

import java.util.Scanner;

/*
 * Write a program to find the sum and product of all elements of an array.
 */
public class SumFind {
	Scanner sc = new Scanner(System.in);

	void sumproduct() {
		int sum = 0, pro = 1;
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the element");
			a[i] = sc.nextInt();
			sum = (sum + a[i]);
			pro = (pro * a[i]);

		}

		System.out.println(sum);

		System.out.println(pro);
	}

	public static void main(String[] args) {
		SumFind sumFind = new SumFind();
		sumFind.sumproduct();
	}

}
