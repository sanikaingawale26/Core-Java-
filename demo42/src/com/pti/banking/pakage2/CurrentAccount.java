package com.pti.banking.pakage2;

import com.pti.banking.model.BankAccount;

public class CurrentAccount extends BankAccount {
//alt+s+c
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accName, double balance) {
		super(accName, balance);
		// TODO Auto-generated constructor stub
	}
// alr+s+v
	@Override
	public double withdraw(double amount) {
		return super.withdraw(amount);
	}

	@Override
	public double deposit(double amount) {
		return super.deposit(amount);
	}
	@Override
	public String toString() {
		return "CurrentAccount [accNo="+this.getAccNo()
				+",accNo="+this.getAccName()
				+", balance="+this.getBalance()
				+ "]";
	}

}
