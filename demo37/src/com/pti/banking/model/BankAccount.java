package com.pti.banking.model;

public class BankAccount {

		
		private int accNo;
		private String  accName;
		private double balance;
		
		private static int autoAccNo=0;
		{
			this.accNo=++autoAccNo;
		}
	//alt+s+c-> default constructor
		public BankAccount() {
			super();
			// TODO Auto-generated constructor stub
		}
//alt+s+a->default constructor 2parameters
	public BankAccount(String accName, double balance) {
		super();
		this.accName = accName;
		this.balance = balance;
	}
	//alt+s+a 
  public BankAccount(int accNo, String accName, double balance) {
	super();
	this.accNo = accNo;
	this.accName = accName;
	this.balance = balance;
}
	//alt+s+r
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
//alt+s+s+s
@Override
public String toString() {
	return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
}
public double withdraw(double amount) {
	this.balance=this.balance+amount;
	return this.balance;
	
}
public double deposit(double amount) {
	this.balance=this.balance+amount;
	return this.balance;
}
}
