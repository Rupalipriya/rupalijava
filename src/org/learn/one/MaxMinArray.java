package org.learn.one;

import java.util.Scanner;

public class MaxMinArray {
	Scanner sc = new Scanner(System.in);

	void findm1m2() {
		int a[] = { 23, 34, 12, 23, 14, 35, 64 };
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
			if (max < a[i])
				max = a[i];

		}
		System.out.println(min);
		System.out.println(max);
	}

	public static void main(String[] args) {
		MaxMinArray maxMinArray = new MaxMinArray();
		maxMinArray.findm1m2();

	}

}
