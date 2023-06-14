package org.learn.oops;
/*
 * WAP in java to take string "welcome to string handling tutorial" as
 *  a input and print it 0th place ,5th place ,
 * 11th place and 20th place character .
 */
public class StringDemoClass {
	char ch;

	public static void main(String[] args) {
		
String s="welcome to string handling tutorial";
char ch =s.charAt(0);
char ch1 =s.charAt(5);
char ch2=s.charAt(11);
char ch3=s.charAt(20);
System.out.println(ch);
System.out.println(ch1);
System.out.println(ch2);
System.out.println(ch3);
	}

}
