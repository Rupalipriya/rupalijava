package org.learn.one;

public class UseOpertaor {
	void operator(boolean b1,boolean b2) {
	
		boolean c =b1&b2;
	System.out.println("AND opertaor " +c);	
	c = b1|b2;
	System.out.println("OR opertaor " +c);
	c =!(b1&b2);
	System.out.println("NOT opertaor " +c);	
	}
public static void main(String[] args) {
	UseOpertaor u =new UseOpertaor();
	u.operator(true, false);
}
}
