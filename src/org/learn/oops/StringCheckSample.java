package org.learn.oops;
/*
 * WAP in java to take string 
 * "this is just a sample string" and check wheather 
 * the given string "start with this" and check wheather 
 *  the given string "start with "hi"
 */
public class StringCheckSample {

	public static void main(String[] args) {
		String s="this is just a sample string";
		if(s.equals("start wiith hi")) {
			System.out.println("true");
		}
		if(s.equals("this")) {
			System.out.println("true");
		}

	}

}
