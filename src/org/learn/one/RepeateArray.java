package org.learn.one;
/*
 * .WAP in java to take a input in an array of size 6 and find repeated element in array.
input =5,9,2,9,3,6
 */
import java.util.Scanner;

public class RepeateArray {
	Scanner sc=new Scanner(System.in);
	
	void arr1() {
		
	
		int arr[]={3,2,3,3,5,5};
		int coun;
		for(int i=0; i<arr.length; i++){    
		 int rep = arr[i];
		 for(int j=i+1;j<arr.length;j++) {
			 if(rep==arr[j]) {
				 System.out.println(rep);
			 }
		 }
		 
		}
		}
	
	public static void main(String[] args) {
		
		RepeateArray  repeateArray =new  RepeateArray();
		repeateArray .arr1();
	}

}
