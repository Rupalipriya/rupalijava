package org.learn.one;

//waj program in which take two variable num1 and num2 
//now swap the value of num1 and num2 
//then increment the num2 value by 1them  decrement num2 value by 1.

//Change the logic,as this logic not work
//done
public class NumberClass {
	int num3;

	void number(int num1, int num2) {
		System.out.println("print the value of num1 and num2 " + num1 + "and" + num2);
		num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("print the value of num1 and num2 " + num1 + "and" + num2);
	}

	public static void main(String[] args) {
		NumberClass n1 = new NumberClass();
		n1.number(23, 12);
	}

}
