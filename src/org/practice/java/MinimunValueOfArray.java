package org.practice.java;
/*
 * .java program to find minimum value in array
input 5 4 9 2 3
 */
public class MinimunValueOfArray {
	void minimumvalue () {
		
		int a[]= {3,4,2,3,6};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if (min>a[i])
			 min=a[i];
				
			
			
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		 MinimunValueOfArray   minimunValueOfArray =new   MinimunValueOfArray();
		 minimunValueOfArray .minimumvalue();
	}

}
