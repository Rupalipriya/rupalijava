package org.learn.one;

public class CheckCondition {
	void c1(int a) {
		if (a>10) {
			System.out.println("postive " );
		}
		else
		{
			System.out.println("negative ");
			}
		}
	
public static void main(String[] args) {
	CheckCondition b =new CheckCondition();
	b.c1(13);
}
}
