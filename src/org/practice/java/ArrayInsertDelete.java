package org.practice.java;

import java.util.Scanner;

/*
 * Java Programs on Inserting & Deleting Elements from an Array
 */
public class ArrayInsertDelete {
	Scanner sc = new Scanner(System.in);

	void insert() {
		int a[] = new int[5];
		int n; 
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the element");
			a[i] = sc.nextInt();

		} 
		System.out.println("enter the place to delete");
		n=sc.nextInt();
		a[n]=0;
		for (int i = 0; i < a.length; i++) {
		//	a[i] = a[0];
			System.out.println(+a[i]);
		} 
		

	}

	public static void main(String[] args) {
		ArrayInsertDelete arrayInsertDelete = new ArrayInsertDelete();
		arrayInsertDelete.insert();
	}

}
