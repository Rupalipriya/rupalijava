package org.learn.one;

public class EncapsulationExampleMathTeacher extends EncapsulationExampleTeacher {
	String mainsub = "math";

	void teach2() {
		System.out.println("math");
	}

	public static void main(String[] args) {
		EncapsulationExampleMathTeacher eet = new EncapsulationExampleMathTeacher();
		eet.tech1();
		System.out.println(eet.designation);
		System.out.println(eet.college);
        eet.teach2();
	}

}
