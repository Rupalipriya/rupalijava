package org.learn.one;

//Java Program to find sum of natural numbers using for loop.
public class NaturalNumber {
	int sum = 0;

	void n1(int num) {

		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of numbers  " + sum);
	}

	public static void main(String[] args) {
		NaturalNumber naturalNumber = new NaturalNumber();
		naturalNumber.n1(3);
	}

}
