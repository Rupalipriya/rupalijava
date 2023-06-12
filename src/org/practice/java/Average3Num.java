package org.practice.java;

/*
 * Write a Java program that takes three numbers as input to calculate
 *  and print the average of the numbers
 */
public class Average3Num {
	int A;

	void av(int a, int b, int c) {
		A = (a + b + c) / 3;
		System.out.println("average " + A);
	}

	public static void main(String[] args) {
		Average3Num average3Num = new Average3Num();
		average3Num.av(2, 4, 3);

	}

}
