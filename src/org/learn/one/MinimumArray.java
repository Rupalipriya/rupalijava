package org.learn.one;

import java.util.Scanner;

public class MinimumArray {
	  
	Scanner sc = new Scanner(System.in);
	int min;
void m1() {
	
	

int arr[] = new int[5];

for(int i=0; i<=5; i++){
    arr[i] = sc.nextInt();

System.out.print("Enter array Size : ");


System.out.print("Enter array elements : ");


}

for(int i=0; i<5; i++){ 
    if(  min>arr[i]){
        min = arr[i];
	
}
    System.out.print("Searching for the minimum Element....\n\n");
}


}

	public static void main(String[] args) {
		MinimumArray minimumArray=new MinimumArray();
		minimumArray.m1();

	}

}
