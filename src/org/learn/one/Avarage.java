package org.learn.one;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers
public class Avarage {
	int A;

	void a1(int a, int b, int c) {
		A = (a + b + c) / 3;
		System.out.println("avarage " + A);
	}

	public static void main(String[] args) {
		Avarage avarage = new Avarage();
		avarage.a1(4, 2, 3);

	}

}
