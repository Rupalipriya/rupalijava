package org.learn.exception;

public class FinalWithRurtun {

	public static void main(String[] args) {
		{
			try
			{
			System.out.println("try");
			System.exit(0);//jvm shutdown
			}
			catch(ArithmeticException e)
			{
			System.out.println("catch block executed");
			}
			finally
			{
			System.out.println("finally block executed");

			}}		
	}

}
