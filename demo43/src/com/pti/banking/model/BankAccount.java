package com.pti.banking.model;

public class BankAccount {
protected	int accNo;
protected String accName;
protected   double balance;
protected  static int accNoCounter=0;
    {
    	this.accNo=++accNoCounter;
    }
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	public BankAccount(String accName, double balance) {
		super();
		this.accName = accName;
		this.balance = balance;
	}
	
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
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
	public double withdraw(double amount) {
		this.balance=this.balance-amount;
		return this.balance;
		
	}
	public double deposit(double amount) {
		this.balance=this.balance+amount;
		return this.balance;
	
	

}
}
