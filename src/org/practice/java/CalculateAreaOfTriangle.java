package org.practice.java;

/*
 *  WAJP to calculate area of triangle.
 */
public class CalculateAreaOfTriangle {
	void areaoftriangle(int l, int b, int h) {
		int areaoftriangle = l * b * h;
		System.out.println("print area of trianlge " + areaoftriangle);

	}

	public static void main(String[] args) {
		CalculateAreaOfTriangle calculateAreaOfTriangle = new CalculateAreaOfTriangle();
		calculateAreaOfTriangle.areaoftriangle(2, 4, 2);

	}

}
