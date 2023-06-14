package org.practice.java;
/*
 * .WAP in java to multiply elements of 2d array.
 */
public class MultiplyTwoDimenstionalArray {
void multiply2darray() {
	int mul=1;
	int a[][]= {{1,2,3,4},{2,3,4,5}};
//	1 2 3 4
//	2 3 4 5
	for(int i=0;i<2;i++) {
		for(int j=0;j<4;j++) {
			mul=mul*a[i][j];
		}
	}
	for(int i=0;i<2;i++) {
		for(int j=0;j<4;j++) {
			System.out.print( a[i][j] + " ");
			
		}
		System.out.println();
		}
	System.out.println("multiply array " +mul);
}
	public static void main(String[] args) {
		MultiplyTwoDimenstionalArray multiplyTwoDimenstionalArray=new MultiplyTwoDimenstionalArray();
		multiplyTwoDimenstionalArray.multiply2darray();

	}

}
