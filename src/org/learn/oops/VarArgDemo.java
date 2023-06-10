package org.learn.oops;

public class VarArgDemo {

	void m1(int... x) {
		System.out.println("var-arg method");
	}
	
	public static void main(String[] args) {
		VarArgDemo v=new VarArgDemo();
	//	v.m1(10);
		//v.m1(10,40,70);
		v.m1();
	}
	
	
}
