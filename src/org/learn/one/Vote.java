package org.learn.one;

//WAJP in which take a number as age and check whether he is eligibale to vote or not.
public class Vote {

	void vt(int age) {
		if (age >= 18) {
			System.out.println("eligible for vote ");
		} else {
			System.out.println("not eligible for vote ");
		}
	}

	public static void main(String[] args) {
		Vote v1 = new Vote();
		v1.vt(12);
	}
}
