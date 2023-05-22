package org.learn.one;

/*program
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
public class IncreaseNestedLoop {
	void i1() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		IncreaseNestedLoop increaseNestedLoop = new IncreaseNestedLoop();
		increaseNestedLoop.i1();

	}

}
