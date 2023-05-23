package org.learn.one;

//.java program to find minimum value in array
import java.util.Scanner;

public class MinimumArray {

	Scanner sc = new Scanner(System.in);

	void m1() {
		int arr[] = { 12, 13, 15, 10, 34, 11 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.print(min);
	}

	public static void main(String[] args) {
		MinimumArray minimumArray = new MinimumArray();
		minimumArray.m1();

	}

}
