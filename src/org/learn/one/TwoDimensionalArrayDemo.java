package org.learn.one;

import java.util.Scanner;

/*
 * 11 22 33
 * 44 55 66
 */
public class TwoDimensionalArrayDemo {
	
	int arr[][]=new int[3][3];
//	int arr1[][]={{11,22,33},{44,55,66}};
	Scanner scanner=new Scanner(System.in);
	void m1() {
	/*	for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}*/
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter the elements"+ i+""+j);
				arr[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	TwoDimensionalArrayDemo tw=new TwoDimensionalArrayDemo();
	tw.m1();
}
}
