package com.pti.banking.model;

public class SavingAccount extends BankAccount {

	 private static final double MIN_BALANCE = 1000.00;

	 public SavingAccount() {
	  super();
	 }

	 public SavingAccount(int accNO, String accName, double balance) {
	  super(accNO, accName, balance);
	 }

	 public SavingAccount(String accName, double balance) {
	  super(accName, balance);
	 }

	 @Override
	 public String toString() {
	  return "BankAccount "
	    + "[accNO=" + this.getAccNO() 
	    + ", accName=" + this.getAccName() 
	    + ", balance=" + this.getBalance()
	    + ", Minimum Balance=" + MIN_BALANCE
	    + "]";
	 }

	 @Override
	 public double withdraw(double amount) throws Exception {
	  final double difference=this.getBalance()-amount;
	  if(difference>=MIN_BALANCE) {
	   this.setBalance(difference);
	  }else if(amount==this.getBalance()) {
	   throw new InsufficientBalanceException("Insufficient Balance");
	  }else {
	   throw new MaintainMinimumBalanceException("Please try different amount,"
	     + " ensure to maintain minimum balance of "+MIN_BALANCE);
	  }
	  return this.getBalance();
	 }

	 
	}
