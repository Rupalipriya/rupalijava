package org.practice.java;

import java.util.Scanner;

/*
 * Java Programs on Printing the Elements of an Array
 */
public class PrintTheElementArray {
	Scanner sc =new Scanner(System.in);
	void elementarray() {
	
		
		int a[]=new int[5];
		for(int i=0;i<=4;i++) {
			System.out.println("enter the element ");
		a[i]=sc.nextInt();
		
		}
		for(int i =0;i<=4;i++) {
			System.out.println( "print the element " +a[i]);
		
		}
		
		}
		
	

	public static void main(String[] args) {
		PrintTheElementArray printTheElementArray=new PrintTheElementArray();
		printTheElementArray.elementarray();

	}

}
