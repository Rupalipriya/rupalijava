package org.learn.one;
/*
 * Program to serach any value in Array
 */
import java.util.Scanner;

public class SearchArray {
	Scanner ac = new Scanner(System.in);

	void s1() {
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the " + i + "element");
			arr[i] = ac.nextInt();
		}
		System.out.println("Enter the value to search");
		int value = ac.nextInt();
		for (int i = 0; i < 5; i++) {
			if (arr[i] == value) {
				System.out.println("found");
				break;
			} else {
				System.out.println("not found");
			}
		}
	}

	public static void main(String[] args) {
		SearchArray searchArray = new SearchArray();
		searchArray.s1();

	}

}
