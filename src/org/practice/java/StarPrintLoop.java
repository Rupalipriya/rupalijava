package org.practice.java;
/*
 * #22.  program nested loop
*
* *
* * *
* * * *
* * * * *

 */
public class StarPrintLoop {
void s1() {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		StarPrintLoop  starPrintLoop=new StarPrintLoop();
		starPrintLoop .s1();

	}

}
