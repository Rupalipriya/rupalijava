package org.learn.one;

//jp multiply two numbers

//Please change class name give proper class name
public class MultiplyTwoNumber {
	void multiply(int a, int b) {
		int c = a * b;
		System.out.println("value of a and b " + c);
	}

	public static void main(String[] args) {
		MultiplyTwoNumber m1 = new MultiplyTwoNumber();
		m1.multiply(23, 120);
	}
}

