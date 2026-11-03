package com.pti.banking;



import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SalaryAccount;
import com.pti.banking.model.SavingAccount;
import com.pti.banking.pakage2.CurrentAccount;


public class BankApp {

	
	public static void main(String[] args) {
		//Access modifier -private in inheritance
		//override method behaviour
		BankAccount account=new BankAccount("John Deo",50000);
		//default members are not accessible outside the class and outside the package
		System.out.println(account.getBalance());
		account=new SavingAccount("ALice",50000);
		System.out.println(account);
		  System.out.println(account.withdraw(10000));
		  System.out.println(account.deposit(10000));
		  
		  account=new SalaryAccount("Adam", 50000);
		  System.out.println(account);
		  System.out.println(account.withdraw(10000));
		  System.out.println(account.deposit(10000));
		  
		  account=new CurrentAccount("Bob", 50000);
		  System.out.println(account);
		  System.out.println(account.withdraw(10000));
		  System.out.println(account.deposit(10000));
		
		
	}
}
