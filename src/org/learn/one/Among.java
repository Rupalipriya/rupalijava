package org.learn.one;

public class Among {
void a1(int a, int b,int c) {
	
	if(a>b && a>c) {
		System.out.println("largest number " +a);
	}
	else
		if (b>a && b>c) {
		System.out.println("laergest number "+b);
	}
		else 
			if(c>a && c>b) {
				System.out.println("largest number "+c);
			}
	
}
public static void main(String[] args) {
	Among a=new Among();
	a.a1(77, 45, 66);
}

}
