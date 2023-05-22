package org.learn.one;

/*program
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
public class NestedLoopNor {
	void n1() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		NestedLoopNor nestedLoopNor = new NestedLoopNor();
		nestedLoopNor.n1();

	}

}
