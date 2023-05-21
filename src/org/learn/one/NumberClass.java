package org.learn.one;

public class NumberClass {
  void number( int num1,int num2) {
	  System.out.println("print the value of num1 and num2 "+num1+"and"+num2);
num2 =num1;
System.out.println("print the value of num1 and num2 "+num1+"and"+num2);
  }
  public static void main(String[] args) {
	NumberClass n1 = new NumberClass();
	n1.number(12, 10);
}
  
}
