package org.practice.java;
/*
 * Java Program to find sum of natural numbers using for loop.
 */
public class SumNaturalNum {
	int sum=0;
	void natural () {
		for(int i=0; i<=10;i++)
		{
			sum =sum+i;
			
		}
		System.out.println("sum of the number " +sum);
	}

	public static void main(String[] args) {
		SumNaturalNum sumNaturalNum=new SumNaturalNum();
		sumNaturalNum.natural();
		

	}

}
