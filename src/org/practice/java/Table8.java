package org.practice.java;

/*
 *  Write a Java program that takes a number as input and prints
 *   its multiplication table up to 10.
 */
public class Table8 {
	
	void table() {
		int mul = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j<=2; j++) {
				mul = i * j;
				System.out.print(j + "*" + i + "=" + j * i);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Table8 table8 = new Table8();
		table8.table();

	}

}
