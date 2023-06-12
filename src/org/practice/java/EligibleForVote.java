package org.practice.java;
/*
 *  WAJP in which take a number as age and check whether he is eligible to vote or not.
 */
public class EligibleForVote {
	void vote(int age) {
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("not eligible for vote ");
		}
	}

	public static void main(String[] args) {
		 EligibleForVote   eligibleForVote = new   EligibleForVote();
		 eligibleForVote .vote(14);

	}

}
