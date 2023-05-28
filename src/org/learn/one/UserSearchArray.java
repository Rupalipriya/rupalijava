package org.learn.one;

import java.util.Scanner;

/*
 * Take 10 integer inputs from user and store them in an array. 
 * Again ask user to give a number. Now,
 *  tell user whether that number is present in array or not.
 */
public class UserSearchArray {
	Scanner sc = new Scanner(System.in);

	void us() {
		int user;
		int counter = 0;
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {

			System.out.println("enter the element");
			a[i] = sc.nextInt();

		}
		System.out.println("enter the  value ");
		user = sc.nextInt();
		for (int j = 0; j < a.length; j++) {
			if (user == a[j]) {
				counter++;

				break;

			} else {
				counter = 0;

			}
		}
		if (counter > 0) {
			System.out.println("value is present ");
		} else {
			System.out.println("value is not present");
		}
	}

	public static void main(String[] args) {
		UserSearchArray userSearchArray = new UserSearchArray();
		userSearchArray.us();
	}

}
