package org.lang.exception;

public class MultiCatchBlock {

	public static void main(String[] args) {
		Integer i=10;
		Integer j=20;
		
		try {
			System.out.println(j/i);
		}
		catch(ArithmeticException e) {
System.out.println("ar executed");
	}
     catch(NullPointerException e) {
    	 System.out.println("nul executed");
     }
		catch(Exception e) {
			System.out.println("executed");
		}
	}
}
