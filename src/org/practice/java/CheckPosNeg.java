package org.practice.java;

/*
 *  WAJP to check if number is positive or negative  
 */
public class CheckPosNeg {
	void posneg(int a) {
		if (a >= 0) {
			System.out.println("positive ");

		} else {
			System.out.println("negative");
		}
	}

	public static void main(String[] args) {
		CheckPosNeg checkPosNeg = new CheckPosNeg();
		checkPosNeg.posneg(-2);
	}

}
