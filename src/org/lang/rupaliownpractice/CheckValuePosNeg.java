package org.lang.rupaliownpractice;
/*
 *  WAJP to check if number is positive or negative 
 */
public class CheckValuePosNeg {
	void checkposneg(int a) {
		if(a>=0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}
	}

	public static void main(String[] args) {
		CheckValuePosNeg checkValuePosNeg=new CheckValuePosNeg();
		checkValuePosNeg.checkposneg(8);

	}

}
