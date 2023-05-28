package org.learn.one;
/*
 * Write a program to check if elements of an array are same or not it read from front or back. 
 */
public class ReadBackFront {
	void readbackfront() {
		int a[]= {1,2,4,5,2,1};
		int front=0,back=0,front1=0,back1=0;
		int ln=a.length-1;
		    front=a[0];
			front1=a[0+1];
			back=a[ln];
			back1=a[ln-1];
	if(front==back && front1==back1) {
			
			System.out.println("elements of an array are same ");
			
			 }
		
			else   {
			 
				System.out.println("elements of an array are  not same ");
		}
	
		}
		
		



		
		
	public static void main(String[] args) {
		ReadBackFront readBackFront=new ReadBackFront();
		readBackFront.readbackfront();
	}

}
