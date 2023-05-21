package org.learn.one;

public class NaturalNumber {
	int sum =0;
	void n1(int num ) {
	
	 for (int i = 0; i<10; i++){
		 sum = sum +i;
      }
      System.out.println("Sum of numbers  " +sum  );
   }

	public static void main(String[] args) {
		NaturalNumber naturalNumber =new NaturalNumber();
		naturalNumber.n1(3);
	}

}
