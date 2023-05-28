package org.learn.one;

/*
 * .WAP in java to take array as an input and check whether it is palidrom or not .
INPUT Data
{1,9,5,2}
output=not palidrom.
input{1,2,1}e
output= palidrom
 */
public class ArrayPalidrom {
	void array() {
		int arr[] = { 9, 0, 0, 0, 9 };
		int smp = 0, rev = 0;
		int ln = arr.length - 1;

		smp = arr[0];
		rev = arr[arr.length - 1];
		int smp1 = arr[0 + 1];
		int rev1 = arr[ln - 1];
		if (smp == rev && smp1 == rev1) {
			System.out.println("palindorme");
		} else {
			System.out.println("not palindorm");
		}
	}

	public static void main(String[] args) {
		ArrayPalidrom arrayPalidrom = new ArrayPalidrom();
		arrayPalidrom.array();
	}

}
