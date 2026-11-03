package com.pti.banking;
import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SalaryAccount;
import com.pti.banking.model.SavingAccount;
import com.pti.banking.model.TransferMoney;
import com.pti.banking.pakage2.CurrentAccount;


public class BankApp {

	
	public static void main(String[] args) {
		//Access modifier -private in inheritance
		//override method behaviour
		BankAccount bankAccount=new BankAccount("John Doe", 50000.00);
		  SavingAccount savingAccount=new SavingAccount("Alice",50000.00);
		  SalaryAccount salaryAccount=new SalaryAccount("Bob",50000.00);
		  CurrentAccount currentAccount=new CurrentAccount("Adam",50000.00);
		//  Protected Members Not accessible to other classes outside the package 
		  System.out.println(bankAccount.getBalance());
		//  Alice ->10000->Bob
		  System.out.println(bankAccount);  
		  System.out.println(savingAccount);
		  System.out.println(salaryAccount);
		  System.out.println(currentAccount);
		  
		
		  TransferMoney transferMoney=new TransferMoney(savingAccount);
		  final String message=transferMoney.transferMoney(salaryAccount, 10000);
		  System.out.println(message);
	}
}
