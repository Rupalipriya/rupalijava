package org.learn.oops;
/*
 * .WAP in java to take string "     how are you?     " and 
 * print the string before the
 *  trim and after the trim.
 */
public class StringUseTrim {

	public static void main(String[] args) {
		String s="     how are you     ";
		String s1=s.trim();
		System.out.println(" before trim " +s);
		System.out.println("after trim " +s1);
	}

}
