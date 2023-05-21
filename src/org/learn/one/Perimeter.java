package org.learn.one;

// Write a Java program to print the area and perimeter of a rectangle.
public class Perimeter {
	float perimeter, area;

	void p1(float l, float b) {
		perimeter = 2 * (l + b);
		System.out.println("Perimeter of rectangle " + perimeter);
		area = l * b;
		System.out.println("Area of rectangle " + area);
	}

	public static void main(String[] args) {
		Perimeter perimeter = new Perimeter();
		perimeter.p1(3, 7);
	}

}
