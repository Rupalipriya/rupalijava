package org.learn.one;

//Java Program to find factorial of a number using loops.
public class Factorial {
	int fact = 1;

	void f1(int num) {

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of is " + fact);
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		factorial.f1(5);
	}

}
