package org.learn.oops;

public class AutomaticProm {

	
	public void m1(String s) {
		System.out.println("This is string arg"+s);
	}
	public void m1(StringBuffer sf) {
		System.out.println("This is StringBuffer arg");
	}


	public static void main(String[] args) {
		AutomaticProm ap = new AutomaticProm();
		//ap.m1(null);//C.E
		
	}
}
