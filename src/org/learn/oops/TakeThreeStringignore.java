package org.learn.oops;
/*
 * WAP in java to take 3 string "apple,MANGO,APPLE" 
 * as an input and compaire string 1to string2,
 * string1 to string3,string1 to welcome ,
 * string1 to apple,string2 to mango and use ignore case.
5
 */
public class TakeThreeStringignore {

	public static void main(String[] args) {
	String s1="apple";
	String s2="MANGO";
	String s3="APPLE";
	if(s1.equals(s2)) {
		System.out.println(s1);
	}
	if(s1.equalsIgnoreCase(s3)) {
		System.out.println(s1);
	}
	if(s1.equals("welcome")) {
		System.out.println(s1);
	}
	if(s1.equalsIgnoreCase("apple")) {
		System.out.println(s1);
	}
	if(s2.equalsIgnoreCase("mango")) {
		System.out.println(s2);
		
	}
	
	}

}
