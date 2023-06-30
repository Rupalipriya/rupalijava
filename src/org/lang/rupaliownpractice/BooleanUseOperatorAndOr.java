package org.lang.rupaliownpractice;
/*
 * waj program  in which take two bollean 
 * veriable b1 and b2 and in b1 store true and b2 store false 
   now apply AND opertaor OR OPERTAOR 
   and NOR oprrator between b1 and b2  and print it.
 */
public class BooleanUseOperatorAndOr {
	void useoperator( ) {
		
		boolean b1= true;
		boolean b2= false;
		 boolean c= b1&&b2;
		 System.out.println(" AND value =" +c);
		 c=b1||b2;
		 System.out.println("OR value =" +c);
		 c=!(b1&&b2);
		 System.out.println("NOR value =" +c);
		
		
		
		
	}

	public static void main(String[] args) {
		BooleanUseOperatorAndOr booleanUseOperatorAndOr=new BooleanUseOperatorAndOr();
		booleanUseOperatorAndOr.useoperator();
	}

}
