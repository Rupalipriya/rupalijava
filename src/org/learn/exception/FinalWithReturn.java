package org.learn.exception;

public class FinalWithReturn {
	
	int m1() {
		int a=1;
		try
		{
		System.out.println("try block executed");
		return a;
		}
		catch(ArithmeticException e)
		{
		System.out.println("catch block executed");
		}
		finally
		{
		System.out.println("finally block executed");

		}
		return a;
	}
	

	public static void main(String[] args){
		FinalWithReturn ff=new FinalWithReturn();
	    int f=	ff.m1();
	    System.out.println(f);
		
	}
	
}
