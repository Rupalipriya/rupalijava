package org.practice.java;
/*
 * waj program in which take two veriable num1 and num2
 *  now swap the value of num1 and num 2 then increament 
 *  the num2 value by 1them  decrement num2 value by 1.

 */
public class TwoVeriableNum {
	void veriable(int num1, int num2) {
		int num3=0;
		System.out.println("the value of num " +num1 +"and" +num2);
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("the value of num " +num1 +"and" +num2);
	}

	public static void main(String[] args) {
		TwoVeriableNum twoVeriableNum=new TwoVeriableNum();
		twoVeriableNum.veriable(23, 34);
	}

}
