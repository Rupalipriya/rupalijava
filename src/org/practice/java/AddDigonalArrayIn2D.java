package org.practice.java;

/*
 * WAP in java in which add the diagonal elements of 2d array.
 */
public class AddDigonalArrayIn2D {
	void adddigonal() {
		int add = 0;
		int a[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };
		// 1 2 3
		// 3 4 5
		// 6 7 8
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					add = add + a[i][j];
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println(+add);

		
	}

	public static void main(String[] args) {
		AddDigonalArrayIn2D addDigonalArrayIn2D = new AddDigonalArrayIn2D();
		addDigonalArrayIn2D.adddigonal();
	}

}
