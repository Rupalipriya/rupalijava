package org.learn.one;

//waj program in which take two veriable num1 and num2 now swap the value of num1 and num 2 then increament the num2 value by 1them  decrement num2 value by 1.
public class NumberClass {
	void number(int num1, int num2) {
		System.out.println("print the value of num1 and num2 " + num1 + "and" + num2);
		num2 = num1;
		System.out.println("print the value of num1 and num2 " + num1 + "and" + num2);
	}

	public static void main(String[] args) {
		NumberClass n1 = new NumberClass();
		n1.number(12, 10);
	}

}
