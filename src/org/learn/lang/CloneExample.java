package org.learn.lang;

public class CloneExample implements Cloneable {
	int a=10;
	int b=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExample cl=new CloneExample();
		CloneExample cl2=(CloneExample)cl.clone();
		cl2.a=666;
		cl2.b=777;
		System.out.println("value of a and b with cl: "+cl.a+" "+cl.b);
		System.out.println("value of a and b with cl2: "+cl2.a+" "+cl2.b);
	}
}