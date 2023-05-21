package org.learn.one;

//WAJP  to check two number are equal or not .
public class Equal {
	void equal(int a, int b) {
		if (a == b) {
			System.out.println(" number are equal ");
		} else {
			System.out.println(" number not equal ");
		}
	}

	public static void main(String[] args) {
		Equal eq = new Equal();
		eq.equal(12, 13);
	}
}
