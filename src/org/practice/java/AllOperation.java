package org.practice.java;

/*
 * jp to add,multiply ,minus ,modulus and divide
 */
public class AllOperation {
	void cal(int a, int b) {
		int c;
		c = a + b;
		System.out.println("add " + c);
		c = a - b;
		System.out.println("sub " + c);
		c = a * b;
		System.out.println("mul " + c);
		c = a % b;
		System.out.println("moduls " + c);
		c = a / b;
		System.out.println("divide " + c);

	}

	public static void main(String[] args) {
		AllOperation allOperation = new AllOperation();
		allOperation.cal(2, 4);
	}

}
