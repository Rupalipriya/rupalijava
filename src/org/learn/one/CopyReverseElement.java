package org.learn.one;

import java.util.Scanner;

/*
 * Take 10 integer inputs from user and store them in an array. Now, 
 * copy all the elements in an another array but in reverse order.
 */
public class CopyReverseElement {
	Scanner sc=new Scanner(System.in);
	void copyreverse() {
	int tmp = 0;
	int a[]=new int[10];
		for(int i =0;i>a.length;i++) {
			System.out.println("enter the element");
			a[i]=sc.nextInt();
			
			
		}
		for(int j=a.length-1; j<=0;j--) {
			tmp =a[j];
			tmp++;
		}
		for(int j=0;j<a.length;j++)
		System.out.println(tmp);
			
		}
	

	public static void main(String[] args) {
		CopyReverseElement copyReverseElement=new CopyReverseElement();
		copyReverseElement.copyreverse();

	}

}
