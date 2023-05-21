package org.learn.one;

//Java Program to check whether a char is vowel or Consonant using Switch Case
public class VowelCons {

	void v1(char v) {

		switch (v) {
		case 'A':
			System.out.println("  Vowel " + v);
			break;
		case 'E':
			System.out.println(" Vowel " + v);
			break;
		case 'I':
			System.out.println("  Vowel." + v);
			break;
		case 'O':
			System.out.println("  Vowel " + v);
			break;
		case 'U':
			System.out.println("  Vowel " + v);
			break;

		default:
			System.out.println(" consonant " + v);

		}

	}

	public static void main(String[] args) {
		VowelCons vowelCons = new VowelCons();
		vowelCons.v1('O');

	}
}
