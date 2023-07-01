package org.practice.java;
/*
 *  program 
           *
         * * 
       * * * 
     * * * * 
   * * * * *

 */
public class StarRightPrint {
	void rightstar() {
		for(int i=0; i<=4; i++) {
			for(int j=i; j<=4; j++) 
				
				System.out.print(" ");
			
				for(int k=0; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	

	public static void main(String[] args) {
		
		StarRightPrint starRightPrint=new StarRightPrint();
		starRightPrint.rightstar();
	}

}
