package org.learn.oops;
/*
 * WAP in java in which to take string as an
 *  input and check how many times a is reapeted.
 */
public class RepaeatedHowManyTimes {

	public static void main(String[] args) {
		String s="employee";
		char ch[] =s.toCharArray();
		char count=0;
		for(int i=0; i<ch.length; i++) {
			char rep = ch[i];
			
					for(int j=i+1;j<ch.length;i++) {
						if(rep==ch[j]) {
							count=2;
							break;
						}
						count++;
						System.out.print(count);
					}
					
		}
		

	}

}
