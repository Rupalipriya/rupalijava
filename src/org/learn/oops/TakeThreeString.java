package org.learn.oops;
/*
 * .WAP in java to take 3 string "hello, hi, hello"  and 
 * campaire string 1 to string 2,
 *  string 1 to string 3,string1 to welcome ,
 * string1 to hello,string2 to hello.
 */
public class TakeThreeString {

	public static void main(String[] args) {
		String s="hello";
		String s1="hi";
		String s2="hello";
		if(s.equals(s1)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(s.equals(s2)) {
			System.out.println("true");
		
		}
		else {
			System.out.println(false);
		}
		if(s.equals("walcome")) {
			System.out.println("match");
		}
		if(s.equals("hello")) {
			System.out.println("match");
			
		}
		if(s1.equals("hello")) {
			System.out.println("match");
		}

	}

}
