package org.practice.java;
/*
 * WAP in java to print the elements of array present at even  position.
 */
public class EvenPositionInArray {
	void evenposition() {
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			System.out.println("even position " +a[i]);
		}
		}
	}

	public static void main(String[] args) {
		EvenPositionInArray evenPositionInArray=new EvenPositionInArray();
		evenPositionInArray.evenposition();

	}

}
