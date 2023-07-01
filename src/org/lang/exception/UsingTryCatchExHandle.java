package org.lang.exception;

public class UsingTryCatchExHandle {

	public static void main(String[] args) {
		int price=20;
		int disc=0;
		try {
			System.out.println(price/disc);
		}
		catch(ArithmeticException e) {
			System.out.println("catch block executed");
		}

	}

}
