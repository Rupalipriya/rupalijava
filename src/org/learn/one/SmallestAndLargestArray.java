package org.learn.one;

import java.util.Scanner;

//java Programs on Largest & Smallest Numbers in an Array
public class SmallestAndLargestArray {
	Scanner sc=new Scanner(System.in);
	void arrayInput1() {
	

	       int arr[] = {12, 13, 15, 10, 34, 10};

	       int largest = arr[0], smallest=arr[0];

	       for(int i=0; i<arr.length; i++) { if(smallest > arr[i])
	              smallest = arr[i];
	           if(largest < arr[i])
	              largest = arr[i];

	       }

	       System.out.println(smallest);
	       System.out.println(largest);
	   }
	

	public static void main(String[] args) {
		SmallestAndLargestArray smallestAndLargestArray = new SmallestAndLargestArray();
		smallestAndLargestArray.arrayInput1();

	}

}
