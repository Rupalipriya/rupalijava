package org.learn.oops;

public class  StaticVariable{
	static int a=10;
	int b=20;
public StaticVariable() {
	a++;
	b++;
	System.out.println("value of a=" +a);
	System.out.println();
	
	System.out.println("value of b=" +b);
}
	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable();
		StaticVariable s2=new StaticVariable();
		StaticVariable s3=new StaticVariable();
		StaticVariable s4=new StaticVariable();
	}

}
