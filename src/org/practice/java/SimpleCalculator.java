package org.practice.java;

/*
 * .Java Program to make a Simple Calculator using Switch Case.
 */
public class SimpleCalculator {
	void cal(int a, int b, char ch) {
		switch (ch) {
		case '+':

			System.out.println(a + b);
			break;
			
		case '-':
			System.out.println(a - b);
			break;
			
		case '*':
			System.out.println(a * b);
			break;
			
		case '/':
			System.out.println(a / b);
			break;
			
		case '%':
			System.out.println(a % b);
			break;
			

		}
	}

	public static void main(String[] args) {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		simpleCalculator.cal(2, 3, '/');
	}
}
