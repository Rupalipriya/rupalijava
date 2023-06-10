package org.learn.one;

import java.util.Scanner;

/*
 * WAP in java to take array in input  an find number of repetition of in element in array
 */
public class ArrayReapeat {
	Scanner sc = new Scanner(System.in);

	void reapeat() {
		int arr[] = { 3, 3, 4, 5, 3, 3 };
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			int rep = arr[i];
			
			 
			for (int j = i+1; j < arr.length; j++) {
				if (rep == arr[j]) {
				count=2;
				break;
				}
				count++;
				System.out.println(count);

			}

		}

	}

	public static void main(String[] args) {
		ArrayReapeat arrayReapeat = new ArrayReapeat();
		arrayReapeat.reapeat();
	}

}
