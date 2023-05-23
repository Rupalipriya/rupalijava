package org.learn.one;

import java.util.Scanner;

//java program to add the elements of array
public class AddArray {
	Scanner sc=new Scanner(System.in);
	
	void addarray() {
		
	      int array[] = new int[10];
	      int sum = 0;
	      System.out.println("Enter the element");
	      for (int i=0; i<10; i++)
	      {
	    	  array[i] = sc.nextInt();
	      }
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is "+sum);
	   }
	
	public static void main(String[] args) {
		AddArray addArray=new AddArray();
		addArray.addarray();
	}

}
