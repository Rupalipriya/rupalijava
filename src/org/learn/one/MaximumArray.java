package org.learn.one;

//java program to find maximum value in array
import java.util.Scanner;

public class MaximumArray {
	Scanner sc = new Scanner(System.in);

	void ma1() {
		int arr[] = { 12, 13, 15, 10, 34, 11 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];

		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		MaximumArray maximumArray = new MaximumArray();
		maximumArray.ma1();

	}

}
