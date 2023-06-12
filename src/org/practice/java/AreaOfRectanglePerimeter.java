package org.practice.java;

/*
 * .Write a Java program to print the area and perimeter of a rectangle.
 */
public class AreaOfRectanglePerimeter {
	int perimeter;
	int area;

	void ap(int l, int b) {
		area = l * b;
		System.out.println("area " + area);
		perimeter = 2 * (l + b);
		System.out.println("perimeter " + perimeter);

	}

	public static void main(String[] args) {
		AreaOfRectanglePerimeter areaOfRectanglePerimeter = new AreaOfRectanglePerimeter();
		areaOfRectanglePerimeter.ap(2, 4);

	}

}
