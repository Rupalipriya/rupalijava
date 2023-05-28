package org.learn.one;

//jp multiply two numbers

//Please change class name give proper class name
public class NewClass {
	void multiply(int a, int b) {
		int c = a * b;
		System.out.println("value of a and b " + c);
	}

	public static void main(String[] args) {
		NewClass m1 = new NewClass();
		m1.multiply(23, 120);
	}
}

