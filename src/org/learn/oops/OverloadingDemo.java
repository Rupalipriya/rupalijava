package org.learn.oops;
/*
 * Overloading example
 */
public class OverloadingDemo {
	
	public void m1(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void m1(float x,float y) {
		float z=x-y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		OverloadingDemo ov=new OverloadingDemo();
		ov.m1(2, 5);//int method call
		ov.m1(15.5f, 13.2f);//float method call
	}
	
}
