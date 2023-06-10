package org.learn.one;

//WAJP  to check two number are equal or not .

//change the class name,give proper name
//done
public class CheckTwoNumEqual {
	void equal(int a, int b) {
		if (a == b) {
			System.out.println(" number are equal ");
		} else {
			System.out.println(" number not equal ");
		}
	}

	public static void main(String[] args) {
		CheckTwoNumEqual eq = new CheckTwoNumEqual();
		eq.equal(0, 0);
	}
}
