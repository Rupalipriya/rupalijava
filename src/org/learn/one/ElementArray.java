package org.learn.one;
//Java Programs on Printing the Elements of an Array
import java.util.Scanner;

public class ElementArray {
	Scanner sc=new Scanner(System.in);
	void element() {
		int arr[]=new int[7];
		for(int i=0;i<7;i++) {
			System.out.println("Enter the "+ i +"element");
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<7;i++) {
			System.out.println("Array elements"+ i +"place"+ arr[i]);
		}
	
	}

	
	
		
	public static void main(String[] args) {
		ElementArray elementArray=new ElementArray();
		elementArray.element();
	}

}
