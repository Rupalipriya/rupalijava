package org.learn.one;

import java.util.Scanner;

public class ArrayDemo {
	
	Scanner sc=new Scanner(System.in);
	/*
	 * Array input
	 */
	void arrayInput() {
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+ i +"element");
			arr[i]=sc.nextInt();
		}
	
	/*
	 * Print array
	 */
		for(int i=0;i<5;i++) {
			System.out.println("Array elements"+i+"place:"+ arr[i]);
		}
	
	}

	public static void main(String[] args) {
  ArrayDemo arrayDemo=new ArrayDemo();
  arrayDemo.arrayInput();
		
	}

}
