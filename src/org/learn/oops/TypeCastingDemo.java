package org.learn.oops;

public class TypeCastingDemo {

	public static void main(String[] args) {
      double d=22.2;
      float f=23.4f;
      int i=10;
      
      double d1=i;//widening
      System.out.println(d1);
      
      int j=(int)d;//narrowing
      int k=(int)f;//narrowing
      float f1=(float)d;//narrowing
		
	}

}
