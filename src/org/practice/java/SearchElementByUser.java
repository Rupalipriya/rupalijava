package org.practice.java;

import java.util.Scanner;

/*
 * java program in which take an array in input and search a element enter by the user 
 */
public class SearchElementByUser {
	Scanner sc=new Scanner(System.in);
	void searchelementbyuser() {
		int a[]= new int[5];
		int value=0;
		for(int i=0;i<5;i++) {
			System.out.println("enter the element");
			a[i]=sc.nextInt();
		}
		System.out.println("enter the value of search element ");
		value=sc.nextInt();
		for(int i=0;i<5;i++) {
		if(a[i]==value) {
			System.out.println("element found");
			break;
		}
		else {
			System.out.println("element not found");
		}
	}
	}

	public static void main(String[] args) {
		 SearchElementByUser   searchElementByUser =new  SearchElementByUser();
		 searchElementByUser .searchelementbyuser();

	}

}
