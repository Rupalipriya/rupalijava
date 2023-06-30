package org.learn.exception;

public class VotingApp {
	
	void vote(int age)  {
		System.out.println("Age is "+ age);
		if(age<18) {
			throw new CustomException("Age is too young, He/She cant vote");
		}
		else if(age>80) {
			throw new CustomException("Age is too old, He/She cant vote");
		}
		
		else {
			System.out.println("He/She can vote");
		}
	}
	
	public static void main(String[] args)  {
		VotingApp voting=new VotingApp();
		voting.vote(81);
	}

}
