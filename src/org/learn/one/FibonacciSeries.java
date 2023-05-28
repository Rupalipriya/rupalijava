package org.learn.one;

//Java Program to print Fibonacci Series using for loop.

//chnage the logic as this logic not works
//done
public class FibonacciSeries {
	int i, n1 = 1, n2 = 2, n3;

	void f1() {
		for (i = 1; i < 5; i++) {
			System.out.println("print " + n3);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
		}
		
	}

	public static void main(String[] args) {
		FibonacciSeries facbonacci = new FibonacciSeries();
		facbonacci.f1();
	}
}
