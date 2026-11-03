package com.pti.banking.model;

public class SalaryAccount extends BankAccount {

	public SalaryAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(String accName, double balance) {
		super(accName, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double withdraw(double amount) {
    	final double difference=this.balance-amount;
    	if(difference>=0) {
    		this.setBalance(difference);
    		}else {
    			System.out.println("Insufficient Balance");
    		}
    	return this.getBalance();
	}
// 50000-50000=>0>=0=>true->setBalance(0)
// 50000-1000=>49000>=0=>true->setbalance(0)
// 50000-51000=>-1000>=0=>False->Insufficient balance
	@Override
	public String toString() {
		return "SalaryAccount [accNo="+this.accNo
				+",accNo="+this.accName
				+", balance="+this.balance
				+ "]";
	}
    
}
