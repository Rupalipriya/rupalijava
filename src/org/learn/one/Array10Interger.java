package org.learn.one;

import java.util.Scanner;

/*
 * Take 10 integer inputs from user and store them in an array and print them on screen.
 */
public class Array10Interger {
	Scanner sc=new Scanner(System.in);
	
    void ai1() {
	int a[]=new int[10];
	for(int i=0; i<10;i++) {
		System.out.println("enter the element");
		a[i]=sc.nextInt();
		
	}
	
	for(int j=0;j<10; j++) {
		System.out.println("print " + a[j]);
	}
}
	
	public static void main(String[] args) {
		Array10Interger array10Interger=new Array10Interger();
		array10Interger.ai1();
	}

}
