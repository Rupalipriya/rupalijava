package org.learn.one;

// WAJP to find a largest among 3 numbers.

//change the class name,give proper name
public class Among3NumCheck {
	void a1(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println("largest number " + a);
		} else if (b > a && b > c) {
			System.out.println("laergest number " + b);
		} else if (c > a && c > b) {
			System.out.println("largest number " + c);
		}

	}

	public static void main(String[] args) {
		Among3NumCheck a = new Among3NumCheck();
		a.a1(77, 45, 66);
	}

}
