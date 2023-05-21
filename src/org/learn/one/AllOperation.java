package org.learn.one;

public class AllOperation {
	void add(int a, int b) {
		int c = a+b;
		System.out.println("addition a and b "+c);
	}
void multiply (int a,int b) {
	int c = a*b;
	System.out.println("multiply a and b "+c);
}
void subtract (int a, int b) {
	int c =a-b;
	System.out.println("subtract a and b "+c);
}
void divide (int a,int b) {
	int c = a/b;
	System.out.println("divide a and b "+c);
}
void moduls (int a,int b) {
	int c = a%b;
	System.out.println("divide a and b "+c);
}
public static void main(String[] args) {
	AllOperation a1 =new AllOperation();
	a1.add(23, 120);
	a1.multiply(23, 120);
	a1.divide(120, 12);
	a1.subtract(13,12);
	a1.moduls(150, 12);
}
}

