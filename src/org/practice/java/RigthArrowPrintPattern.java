package org.practice.java;
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1

 */
public class RigthArrowPrintPattern {
	void arrow() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
							System.out.print(j+" ");
			}
			System.out.println();
			
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			}
		
			

	

	public static void main(String[] args) {
		RigthArrowPrintPattern  rigthArrowPrintPattern =new RigthArrowPrintPattern();
		rigthArrowPrintPattern.arrow();
	}

}
