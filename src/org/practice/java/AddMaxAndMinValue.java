package org.practice.java;

/*
 * java program to find min and max value then add both value
 */
public class AddMaxAndMinValue {
	void addmaxandmin() {
		int a[] = { 2, 4, 6, 7, 9, 23 };
		int max = a[0];
		int min = a[0];
		int sum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];

			if (min > a[i])
				min = a[i];

			sum = max + min;

		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		AddMaxAndMinValue addMaxAndMinValue = new AddMaxAndMinValue();
		addMaxAndMinValue.addmaxandmin();

	}

}
