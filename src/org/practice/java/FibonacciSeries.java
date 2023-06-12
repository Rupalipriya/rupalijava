package org.practice.java;

/*
 * Java Program to print Fibonacci Series using for loop.
 */
public class FibonacciSeries {
	int a1 = 0;
	int a2 = 1;
	int a3;

	void fab() {
		for (int i = 0; i <= 5; i++) {
			
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
			
		}
	}
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.fab();
	}
}
