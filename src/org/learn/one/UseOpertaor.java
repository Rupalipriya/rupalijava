package org.learn.one;

/*WAJP program  in which take two boolean variable b1 and b2 and in b1 store true and b2 store false 
now apply AND operator OR OPERTAOR and NOR operator between b1 and b2  and print it.*/

//change the class name,give proper class name
public class UseOpertaor {
	void operator(boolean b1, boolean b2) {

		boolean c = b1 && b2;
		int a=5;
		System.out.println("AND opertaor " + c);//false
		c = b1 || b2;
		System.out.println("OR opertaor " + c);//true
		c = !(b1 || b2);
		System.out.println("NOT opertaor " + c);//false
	}

	public static void main(String[] args) {
		UseOpertaor u = new UseOpertaor();
		u.operator(true, false);
	}
}
