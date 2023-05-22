package org.learn.one;

/*
24.program 
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 
*/
public class RepeatClass {
	void re1() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " +i);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		RepeatClass repeatClass = new RepeatClass();
		repeatClass.re1();
	}

}
