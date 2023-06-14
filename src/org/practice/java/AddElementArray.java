package org.practice.java;

import java.util.Scanner;
//issue
/*
 * java program to add the elements of array
 */
public class AddElementArray {
	
	
	void addelement() {
		
		int arr[]= {2,2,2,3};
		int add=0;
		for(int i=0;i<=arr.length;i++) {
			
			System.out.println("print the array elemt " +arr[i]);
			add=add+arr[i];
			
			
		}
		
		System.out.println( add);
			
		}
		
		
		
	

	public static void main(String[] args) {
		AddElementArray  addElementArray=new  AddElementArray() ;
		addElementArray .addelement();

	}

}
