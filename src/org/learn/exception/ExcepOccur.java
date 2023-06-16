package org.learn.exception;

public class ExcepOccur {
	
	public static void main(String[] args) {
		int price=20;
		int disc=0;
		try {
		System.out.println(price/disc);//exception occur(Airthematic exception)
	}
	catch (Exception e) {
	//	e.printStackTrace();//java.lang.ArithmeticException: / by zero
		                    // at Newjavaproject/org.learn.exception.ExcepOccur.main(ExcepOccur.java:9)
		//System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
		System.out.println(e.getMessage());/// by zero
	}
		System.out.println("Statement after exception");
				
		
	}
}
