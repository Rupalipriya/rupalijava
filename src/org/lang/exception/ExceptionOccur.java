package org.lang.exception;

public class ExceptionOccur {

	public static void main(String[] args) {
		int price =20;
		int disc= 0;
		try {
			System.out.println(price/disc);
		}
		catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println(e.toString());
        System.out.println(e.getMessage());
	}
System.out.println("statement after execution");
}
}