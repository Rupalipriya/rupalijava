package org.learn.oops;



/*
 * WAP in java to create a class A and take a method addition and add 2 numbers
and inherit the class in B and and create a method subtract and call both method
 */
public class ClassB extends ClassA {
	
	void sub() {
		int a = 9;
		int b = 6;
		int c;
		c = a - b;
		System.out.println("subtract " + c);
	}

	public static void main(String[] args) {
		ClassB classB = new ClassB();
		classB.sub();
		classB.add();
		ClassA classA = new ClassA();
		classA.add();
		ClassA classA1 = new ClassB();
		classA1.add();

	}
}
