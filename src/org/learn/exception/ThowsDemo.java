package org.learn.exception;

public class ThowsDemo {
	
	void m1() throws Exception  {
		int a=10;
		int b=5;
		System.out.println(a/b);
	}
	
	public static void main(String[] args) throws Exception  {
		ThowsDemo th=new ThowsDemo();
		th.m1();
	}

}
