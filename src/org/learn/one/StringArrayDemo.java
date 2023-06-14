package org.learn.one;

import java.util.Scanner;

public class StringArrayDemo {
	
String arr[]=new String[5];	
Scanner sc=new Scanner(System.in);
void m1() {
for(int i=0;i<arr.length;i++) {
	System.out.println("Enter the String:");
	arr[i]=sc.next();
	
}
for(int j=0;j<arr.length;j++) {
	System.out.println(arr[j]);
}

}
public static void main(String[] args) {
	StringArrayDemo stringArrayDemo=new StringArrayDemo();
	stringArrayDemo.m1();
}
}
