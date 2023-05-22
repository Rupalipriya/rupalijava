package org.learn.one;

/* program 
           *
         * * 
       * * * 
     * * * * 
   * * * * *
*/
public class ReversStarNestedLoop {
	void r1() {
		for (int i = 0; i <= 5; i++) {
			
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		ReversStarNestedLoop reversStarNestedLoop = new ReversStarNestedLoop();
		reversStarNestedLoop.r1();

	}

}
