package com.pti.BankApp.model;

public class SavingAccount extends BankAccount {
	 private final double MIN_BAL=10000.00;

	 public SavingAccount() {
	  super();
	 }

	 public SavingAccount(int accNo, String accName, double balance) {
	  super(accNo, accName, balance);
	 }

	 public SavingAccount(String accName, double balance) {
	  super(accName, balance);
	 }
	 
	 @Override
	 public String toString() {
	  return "SavingAccount ["
	    + "accNo=" + this.getAccNo() 
	    + ", accName=" + this.getAccName() 
	    + ", balance=" + this.getBalance() 
	    + ",MIN_BALANCE="+MIN_BAL
	    + "]";
	 }
	 @Override
	 public double withdraw(double amount) throws Exception {
	  final double difference=this.getBalance()-amount;
	  if(amount>this.getBalance()) {
	   throw new InsufficientBalanceException("Insufficient Balance.");
	  }else if(difference>=MIN_BAL) {
	   this.setBalance(difference);
	  }else {
	   throw new MaintainMinimumBalanceException("Try another amount. "
	     + "Ensure to maintian Minimm balance="+MIN_BAL);
	  }
	  return 0;
	 }
	}



