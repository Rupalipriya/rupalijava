package org.practice.java;

/*
 * java program to find maximum value in array
 */
public class MaximumValueOfArray {
	void maxvalue() {
		int a[] = { 2, 3, 4, 5, 6, 9, 12, 1 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
			max = a[i];

		}
		System.out.println("maximum value of array element " + max);

	}

	public static void main(String[] args) {
		MaximumValueOfArray maximumValueOfArray = new MaximumValueOfArray();
		maximumValueOfArray.maxvalue();

	}

}
