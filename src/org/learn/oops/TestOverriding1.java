package org.learn.oops;

public class TestOverriding1 extends TestOverriding{
	
	void sum(int x,int y) {//overriding method
		int z=x-y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		TestOverriding tt=new TestOverriding();
		tt.sum(1, 2);
	}

}
