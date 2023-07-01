package org.practice.java;
/*
 * .  program nested loop
*
* *
* * *
* * * *
* * * * *
 */
public class StarPrintLeft {
	void  star() {
		
		for(int i=0; i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StarPrintLeft starPrintLeft=new StarPrintLeft();
		starPrintLeft.star();
	}

}
