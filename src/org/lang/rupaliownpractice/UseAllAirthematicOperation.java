package org.lang.rupaliownpractice;

/*
 * jp to add,multiply ,minus ,modlus and divide
 */
public class UseAllAirthematicOperation {
	void allcalculation(int a, int b) {
		int c = a + b;
		System.out.println("addition =" + c);
		c = a * b;
		System.out.println("multiply =" + c);
		c = a - b;
		System.out.println("subtraction =" + c);
		c = a / b;
		System.out.println("divide =" + c);
		c = a % b;
		System.out.println("modlus =" + c);
	}

	public static void main(String[] args) {
		UseAllAirthematicOperation useAllAirthematicOperation = new UseAllAirthematicOperation();
		useAllAirthematicOperation.allcalculation(10, 5);

	}

}
