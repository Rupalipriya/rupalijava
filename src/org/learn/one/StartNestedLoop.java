package org.learn.one;

/* program nested loop
*
* *
* * *
* * * *
* * * * *  
*/

public class StartNestedLoop {
	void s1() {
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		StartNestedLoop startNestedLoop=new StartNestedLoop();
		startNestedLoop.s1();
	}

}
