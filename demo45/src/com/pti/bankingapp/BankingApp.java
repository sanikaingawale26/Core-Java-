package com.pti.bankingapp;

import com.pti.bankingapp.model.BankAccount;
import com.pti.bankingapp.model.SalaryAccount;
import com.pti.bankingapp.model.SavingAccount;
//Abastact class and abstract methods 
//DyamicPolymorphism
//BankAccount account reference variable behaves like a child
//account.withdraw(00000.00) - It behaves like SavingAccount/SalaryAccount 
//as per which object is refered 



public class BankingApp {

	public static void main(String[] args) {
		//Below code gives error: 
		 //Can not instantiate type BankAccount
		 //Because BankAccount is an Abstract class
		 //BankAccount bankAccount=new BankAccount("John Doe",50000.00);
		
		//BankAccount referencevariable is referring to SavingAccount
		  BankAccount account=new SavingAccount("John Doe",50000.00);
		  System.out.println(account);//Details of Saving account
		  System.out.println("Deposited 1000:"+account.deposite(1000));
		  System.out.println("Withdrawed 10000:"+account.withdraw(10000));
		  System.out.println("Withdrawed 32000:"+account.withdraw(32000));
		  
		//account is refering to SalaryAccount
		  account=new SalaryAccount("Alice Mathew",5000.00);
		  System.out.println(account);//Details of Saving account
		  System.out.println("Deposited 1000: "+account.deposite(1000));
		  System.out.println("Withdrawed 10000:"+account.withdraw(1000));
		  System.out.println("Withdrawed 32000:"+account.withdraw(3200));
		  System.out.println("Withdrawed 2000: "+account.withdraw(2000));
		  System.out.println("Withdrawed 1800: "+account.withdraw(1800));





	}

}
