package org.learn.oops;

import java.util.Scanner;

/*
1 2 3
4 5 6
7 8 9
 */
public class DiagnoalSum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println("Enter the elemnt for"+arr[i][j]);
				arr[i][j]=sc.nextInt();
			}
		}
	//0,0 1,1 2,2
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			if(i==j) {
			 sum =sum+ arr[i][j];
			}
		}
	}
System.out.println("sum value is: "+sum);
}}
