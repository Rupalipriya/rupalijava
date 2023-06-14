package org.practice.java;

public class MultiplyTwoNum {
	void mul(int a, int b) {

		int mul = 0;
		mul = a * b;
		System.out.println("multiply " + mul);
	}

	public static void main(String[] args) {
		MultiplyTwoNum multiplyTwoNum = new MultiplyTwoNum();
		multiplyTwoNum.mul(2, 4);
	}

}
