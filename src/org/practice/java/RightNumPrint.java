package org.practice.java;
/*
 *
 
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */
public class RightNumPrint {
	void right() {
		for(int i=0;i<=4;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		 RightNumPrint  rightNumPrint=new  RightNumPrint();
		 rightNumPrint.right();

	}

}
