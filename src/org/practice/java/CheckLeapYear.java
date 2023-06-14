package org.practice.java;

/*
 * WAJP to check a number is leapyear or not.
 */
public class CheckLeapYear {
	void check(int a) {
		if (a % 4 == 0) {
			System.out.println("leap year");

		} else {
			System.out.println("not leap year");
		}
	}

	public static void main(String[] args) {
		CheckLeapYear checkLeapYear = new CheckLeapYear();
		checkLeapYear.check(2000);
	}

}
