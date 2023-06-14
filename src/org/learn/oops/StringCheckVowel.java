package org.learn.oops;
/*
 * .WAP in java to take string as as input and
 *  check weather the vowel is present or not .
 */
public class StringCheckVowel {

	public static void main(String[] args) {
		String s="education";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			System.out.println("vowel is present ");
		}
		else {
			System.out.println("vowel no present");
		}
	}

	}

}
