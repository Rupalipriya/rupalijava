package org.learn.one;

// WAJP to calculate area of triangle.
public class AreaOfTriangle {
	void triangle(float b, float h) {
		float area = (b * h) / 2;
		System.out.println("area of triangle " + area);
	}

	public static void main(String[] args) {
		AreaOfTriangle ar = new AreaOfTriangle();
		ar.triangle(23, 12);
	}
}
