package org.practice.java;



/*
 * .Java Program to check whether a char is vowel or Consonant using Switch Case
 */
public class UseSwitchCheckVowelCon {

	void volcon(char ch) {

		switch (ch) {
		case 'A':
			System.out.println("vowel " + ch);
			break;
		case 'E':
			System.out.println("vowel " + ch);
			break;
		case 'i':
			System.out.println("vowel " + ch);
			break;
		case 'O':
			System.out.println("vowel " + ch);
			break;
		case 'U':
			System.out.println("vowel " + ch);
			break;
		default:
			System.out.println("consonant " + ch);
		}

	}

	public static void main(String[] args) {
		UseSwitchCheckVowelCon useSwitchCheckVowelCon = new UseSwitchCheckVowelCon();
		useSwitchCheckVowelCon.volcon('B');

	}

}
