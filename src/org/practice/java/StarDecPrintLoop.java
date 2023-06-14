package org.practice.java;
/*
 * program 
           *
         * * 
       * * * 
     * * * * 
   * * * * *
 */
public class StarDecPrintLoop {
	void revstar() {
		for (int i=0;i<=4;i++) {
			for(int j=i;j<=4;j++)
			
			
				System.out.print(" ");
			
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		}
	public static void main(String[] args) {
		StarDecPrintLoop starDecPrintLoop=new StarDecPrintLoop();
		starDecPrintLoop.revstar();

	}

}
