package com.pti.banking;

import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SalaryAccount;
import com.pti.banking.model.SavingAccount;


public class BankApp {
	
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount("John Deo",7896543.00);
		SavingAccount savingAccount=new SavingAccount("John Deo",7896543.0 );
		SalaryAccount salaryAccount=new SalaryAccount();
		
		System.out.println(bankAccount);
		System.out.println(savingAccount);
		System.out.println(salaryAccount);
		
		
		
				
	}

}
