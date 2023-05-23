package org.learn.one;

//Java progtam to swap first two elements of array
import java.util.Scanner;

public class SwapArray {
	Scanner sc = new Scanner(System.in);

	void s1() {
		int a;
		int[] arr = { 1, 2, 3, 4 };
		System.out.println("Array before Swap" + "\n");
		for (int element : arr) {
			System.out.println(element);
		}

		a = arr[1];
		arr[1] = arr[2];
		arr[2] = a;
		System.out.println("Array after Swap" + "\n");
		for (int element : arr) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		SwapArray swapArray = new SwapArray();
		swapArray.s1();
	}

}
