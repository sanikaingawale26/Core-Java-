package com.pti.bankingapp;

import com.pti.bankingapp.model.BankAccount;
import com.pti.bankingapp.model.SalaryAccount;
import com.pti.bankingapp.model.SavingAccount;

public class BankingApp {

	public static void main(String[] args) {
		//Anonymous class
		BankAccount account=new BankAccount("John Deo",50000.00) {
			@Override
			public double withdraw (double amount) {
			final double difference=this.getBalance()-amount;
			if(difference>=0) {
				this.setBalance(difference);
			}else {
				System.out.println("Insuffucient balance ");
			}
			return this.getBalance();
			}
		  };
		  System.out.println(account);
		  System.out.println("Deposit  10000:\nCurrent Balance"+account.deposite(10000));
		  
		  System.out.println("Withdraw  7000:\nCurrent Balance: "+account.withdraw(7000));
		  
		  System.out.println("Withdraw 70000:\nCurrent Balance:"+account.withdraw(70000));
		 }

		}

		



	


