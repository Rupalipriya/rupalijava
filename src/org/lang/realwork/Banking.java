package org.lang.realwork;

public class Banking {

	void displayAccountnumber() {
		Account accountClass = new Account();
		accountClass.setAccountNumber(123456789);
		System.out.println(accountClass.getAccountNumber());
	}

	void displayAccountholderdetails() {
		Account accountClass = new Account();
		accountClass.setAccountholdername("rupali");
		accountClass.setIfsccode("MOB12345234");
		accountClass.setBankname("SBI");
		accountClass.setAccountNumber(12345678l);
		System.out.println(accountClass.getAccountNumber());
		System.out.println(accountClass.getIfsccode());
		System.out.println(accountClass.getBankname());
		System.out.println(accountClass.getAccountholdername());
	}

	void displayaccountHolderNameaccountNumberamount() {
		Account accountClass = new Account();
		accountClass.setAccountholdername("rupali");
		accountClass.setAccountNumber(123456732);
		accountClass.setAmount(50000);
		System.out.println(accountClass.getAccountholdername());
		System.out.println(accountClass.getAccountNumber());
		System.out.println(accountClass.getAmount());
	}

	void displayamount() {
		Account accountClass = new Account();
		accountClass.setAmount(6000);
		System.out.println(accountClass.getAmount());
	}

	void withdrawAmount(int withdrawAmount) {
		Account accountClass = new Account();
		accountClass.setAmount(7000);
		int amount = accountClass.getAmount();
		int wid = amount - withdrawAmount;
		System.out.println(wid);
	}

	void DepositAmount(int depo) {
		Account accountClass = new Account();
		accountClass.setAmount(7000);
		int amount = accountClass.getAmount();
		int dep = amount + depo;
		System.out.println(dep);
	}

	void tranferAmount(int trf) {

		System.out.println(trf);
	}

	public static void main(String[] args) {

		Banking bankingClass = new Banking();
		bankingClass.withdrawAmount(3000);
		bankingClass.DepositAmount(4000);
		// bankingClass.tranferAmount(9000);
		// bankingClass.displayAccountnumber();
		// bankingClass.displayAccountholderdetails();
		// bankingClass.displayaccountHolderNameaccountNumberamount();
		bankingClass.displayamount();

	}

}
