package org.practice.java;
/*
 * waj program  in which take two boolean variable b1 and b2 and in b1 store true and
 *  b2 store false 
now apply AND operator OR OPERTAOR and NOR operator between b1 and b2  and print it.
 */
public class BooleanCheck {
void check(boolean b1,boolean b2) {
	boolean c=b1&&b2;
	System.out.println("print AND  value  " +c);
	c=b1||b2;
	System.out.println("print OR  value " +c);
	c=!(b1&&b2);
	System.out.println("print nor value " +c);
}
	public static void main(String[] args) {
		BooleanCheck  booleanCheck =new  BooleanCheck();
		booleanCheck .check(true, true);

	}

}
