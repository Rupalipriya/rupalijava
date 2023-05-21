package org.learn.one;

//WAJP to check a number is leapyear or not.
public class LeapYear {
	void leap(int a) {
		if (a % 4 == 0) {
			System.out.println("leap year " + a);
		} else {
			System.out.println("not leap year " + a);
		}
	}

	public static void main(String[] args) {
		LeapYear l1 = new LeapYear();
		l1.leap(2005);
	}

}
