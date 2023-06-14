package org.practice.java;
/*
 * java Programs on Largest & Smallest Numbers in an Array
2
 */
public class ArrayFindLargestSmallest {
	void sm1() {
		
		int a[]= {2,4,5,6,7};
		int large=a[0];
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(large<a[i])
				large=a[i];
			if(small>a[i])
				small=a[i];
		}
		System.out.println(" largest " +large);
		System.out.println("smallest " +small);
	}		
	

	

	public static void main(String[] args) {
		ArrayFindLargestSmallest arrayFindLargestSmallest=new ArrayFindLargestSmallest();
		arrayFindLargestSmallest.sm1();

	}

}
