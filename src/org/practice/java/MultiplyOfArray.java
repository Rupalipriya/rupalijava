package org.practice.java;

import java.util.Scanner;

/*
 * java program to multiply the element of array
 */
public class MultiplyOfArray {
	Scanner sc=new Scanner(System.in);
	
	void mulplyarray() {
		int a[]= new int[5];
		int mul=1;
		for(int i=1;i<a.length;i++) {
			System.out.println("enter the element");
			a[i]=sc.nextInt();
			mul=mul*a[i];
		}
       for(int i=1;i<a.length;i++) {
		
		System.out.println("multiply " +mul);
       }
	}

	public static void main(String[] args) {
		MultiplyOfArray multiplyOfArray=new MultiplyOfArray();
		multiplyOfArray.mulplyarray();

	}

}
