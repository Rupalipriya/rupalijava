package org.lang.exception;

public class FinallyTryCatch {

	public static void main(String[] args) {
		Integer i=10;
		Integer j=20;
		try {
			System.out.println(j/i);
		}
     catch(ArithmeticException e) {
		System.out.println("catch block executed");
	}
     finally 
 {
	System.out.println("finally executed"); 
}
	}
}
