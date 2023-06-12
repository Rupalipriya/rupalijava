package org.learn.one;

/*
 * .Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7

25=7
36=9
---------
a;
c=a/10;2
d=a%10
 */
public class SumDigit {
	int c;
	int d;

	void sumdidgit(int a) {
		int sum = 0;
		c = a / 12;
		System.out.println(+c);
		d = a % 12;
		System.out.println(+d);
		sum = c + d;

		System.out.println(+c+ +d+ " " +sum);
	}
	
	public static void main(String[] args) {
		SumDigit sumDigit = new SumDigit();
		sumDigit.sumdidgit(4);
	}
}
