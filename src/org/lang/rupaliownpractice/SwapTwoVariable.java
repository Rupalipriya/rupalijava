package org.lang.rupaliownpractice;

/*
 * waj program in which take two veriable
 *  num1 and num2 now swap the value of num1 and num 2
 *   then increament the num2 value by 1them 
 *  decrement num2 value by 1.
 */
public class SwapTwoVariable {
	void swapvalue(int num1, int num2) {
		System.out.println("before swap value =" + num1 + " and " + num2);
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("after swap value of =" + num1 + " and " + num2);

	}

	public static void main(String[] args) {
		SwapTwoVariable swapTwoVariable = new SwapTwoVariable();
		swapTwoVariable.swapvalue(2, 5);

	}

}
