package org.learn.oops;
/*
 * .WAP in java to take string as an input and
 *  check wheather it is palidrom or not .
 */
public class StringCheckPalidrom {
	void m1() {
	String s="lala";
	char ch[] =s.toCharArray();
char   smp , rev ;
int ln = ch.length - 1;

smp = ch[0];
rev = ch[ch.length - 1];
char smp1 = ch[0 + 1];
char rev1 = ch[ln - 1];
if (smp == rev && smp1 == rev1) {
	System.out.println("palindorm =" +s);
	
}
else {
	System.out.println("not palidrom");
}
	}
	public static void main(String[] args) {
		StringCheckPalidrom stringCheckPalidrom=new StringCheckPalidrom();
		stringCheckPalidrom.m1();

	}

}
