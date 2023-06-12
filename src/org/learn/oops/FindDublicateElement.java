package org.learn.oops;
/*
 * WAP in java to take string as as input and 
 * find the dublicate elements.
 */
public class FindDublicateElement {
	

	public static void main(String[] args) {
		String s="rupalipriya";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char ch1=ch[i];
			for(int j=i+1;j<ch.length;j++) {
				if(ch1==ch[j]) {
					break;
				}
				System.out.println(ch[j]);
			}
		}


	}

}
