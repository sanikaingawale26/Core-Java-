package com.pti.bankingapp.model;

public class SalaryAccount extends SavingAccount {
	
	public SalaryAccount() {
		super();
	}
	public SalaryAccount (String accName,double balance) {
		super(accName,balance);
	}
	 public SalaryAccount(int accNo, String accName, double balance) {
		  super(accNo,accName,balance);
		 }
		 
		 @Override
		 public String toString() {
		  return "SalaryAccount["
		    + "accNo"+this.getAccNo()
		    + ",accName"+this.getAccName()
		    + ",balance"+this.getBalance()
		    + ",type='ZeroBalanceAccount']";
		 }
		 //alt+s+v
		 @Override
		 public double withdraw(double amount) {
		  final double difference=this.getBalance()-amount;
		  if(difference>=0) {
		   this.setBalance(difference); 
		  }else {
		   System.out.println("Insufficient Balance.");
		  }
		  return this.getBalance();
		 }

}
