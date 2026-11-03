package com.pti.BankApp.model;

public class SavingAccount extends BankAccount {

	 private static final double MIN_BAL=10000.00;
	 
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
	  return "SavingAccount [accNo=" + getAccNo() + ","
	    + " accName=" + getAccName() 
	    + ", balance="
	    + getBalance()
	    +", MIN_BALANCE="+MIN_BAL
	    + "]";
	 }

	 @Override
	 public double withdraw(double amount) throws Exception {
	  final double difference=this.getBalance()-amount;
	  if(difference>=MIN_BAL) {
	   this.setBalance(difference);
	  }else {
	   throw new Exception("Insufficient balance. Please ensure to maintain MIN_Balance");
	  }
	  return this.getBalance();
	 }

	}
