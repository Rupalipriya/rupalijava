package org.practice.java;
/*
 * WAP in java to print the elements of the array at odd position .
 */
public class PrintArrayElementOddPos {
	
void printoddpostion() {
	int a[]= {1,2,3,4,5,6,7};
	for(int i=0;i<a.length;i=i+2) {
		System.out.println("odd postion "+a[i]);
		
	}
}
	public static void main(String[] args) {
		PrintArrayElementOddPos printArrayElementOddPos =new PrintArrayElementOddPos();
		printArrayElementOddPos .printoddpostion();

	}

}
