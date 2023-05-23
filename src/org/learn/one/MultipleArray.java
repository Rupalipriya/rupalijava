package org.learn.one;
//.java program to multiply the element of array
import java.util.Scanner;

public class MultipleArray {
	Scanner sc = new Scanner(System.in);

	void multiply() {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int pro = 1;
		for (int i = 0; i < arr.length; i++) {
			pro = pro * arr[i];
		}
		System.out.println("multiply " + pro);

	}

	public static void main(String[] args) {
		MultipleArray multipleArray = new MultipleArray();
		multipleArray.multiply();
	}

}
