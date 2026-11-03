package com.pti.BankApp.model;

public class SalaryAccount extends BankAccount {

	public SalaryAccount() {
		super();
	}

	public SalaryAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	public SalaryAccount(String accName, double balance) {
		super(accName, balance);
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + getAccNo() + "," + " accName=" + getAccName() + ", balance=" + getBalance()
				+ "]";

	}

	@Override
	public double withdraw(double amount) throws Exception {
		final double difference = this.getBalance() - amount;
		if (difference >= 0) {
			this.setBalance(difference);
		} else {
			throw new InsufficientBalanceException("SalaryAccount cant be zero");
		}
		return this.getBalance();
	}

}
