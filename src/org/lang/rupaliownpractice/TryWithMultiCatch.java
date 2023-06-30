package org.lang.rupaliownpractice;

import java.io.IOException;

public class TryWithMultiCatch {
	
	public static void main(String[] args) {
		Integer i=10;
		Integer j=20;
		
		try {
		System.out.println(j%i);
		System.out.println("try block");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("catch block");
		} 
		finally {
			//always excute
			System.out.println("finally blocked");
		}
		
		
	}

}
