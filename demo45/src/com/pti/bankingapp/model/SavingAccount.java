package com.pti.bankingapp.model;

public class SavingAccount extends BankAccount {

	private static final double MIN_BALACE = 10000.00;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accName, double balance) {
		super(accName, balance);
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	@Override
	public String toString() {
		return "SavingAccount[" + "accNO" + this.getAccNo() + ",accName" + this.getAccName() + ",balance"
				+ this.getBalance() + ",MIN_BALANCE" + this.MIN_BALACE + "]";
	}

	@Override
	public double withdraw(double amount) {
		final double differece = this.getBalance() - amount;
		if (differece >= MIN_BALACE) {
			this.setBalance(differece);
		} else {
			System.out.println("Enter anothe amount to maintain Minimum balance of " + MIN_BALACE);
		}
		return this.getBalance();
	}

}
