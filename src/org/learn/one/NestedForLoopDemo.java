package org.learn.one;

/*
 * Nested for loop Demo Program
 */
public class NestedForLoopDemo {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("value of i is: "+i);
			for(int j=1;j<4;j++) {
				System.out.println("hello "+j);
			}
		}
	}

}
