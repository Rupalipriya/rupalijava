package org.learn.oops;

public class StaticBlockDemo {
	
	static int i;
	static float f;
	static String s;
	static double d;
	int j;
	//static block
	static {
		i=10;
		s="Ram";
	}
	static {
		f=12.5f;
		s="shyam";
		i=90;
		d=78.5;
	}
	//instance block
	{
	j=90;	
	}

}
