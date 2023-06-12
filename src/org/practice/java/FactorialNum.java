package org.practice.java;
/*
 * Java Program to find factorial of a number using loops.
 */
public class FactorialNum {
	void fact(int num) {
		int fact =1;
		for(int i=1;i<=num;i++) {
			 fact=fact*i;
		}
		System.out.println("factorial " +fact);
		
	}

	public static void main(String[] args) {
		FactorialNum factorialNum=new FactorialNum();
		factorialNum.fact(3);

	}

}
