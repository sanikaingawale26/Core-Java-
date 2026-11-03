package com.pti.banking;



import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SalaryAccount;
import com.pti.banking.model.SavingAccount;


public class BankApp {

	
	public static void main(String[] args) {
		//Access modifier -private in inheritance
		//override method behaviour
		BankAccount account=new BankAccount("John Deo",50000.00);
		System.out.println("Current Balance:"+account.getBalance());
		System.out.println("Withdraw amount : 10000");
		System.out.println("After withdraw current Balance "+account.withdraw(10000));
		
	    account=new SavingAccount("John Deo",50000.00);
		System.out.println("Current Balance:"+account.getBalance());
		System.out.println("Withdraw amount : 100000");
		System.out.println("After withdraw current Balance "+account.withdraw(10000));
		
		System.out.println("Withdraw amount : 31000");
		System.out.println("After withdraw current Balance "+account.withdraw(31000));
		
		
		account=new SalaryAccount("John Deo",50000.00);
		System.out.println("Current Balance:"+account.getBalance());
		System.out.println("Withdraw amount : 50000");
		System.out.println("After withdraw current Balance "+account.withdraw(50000));
		
		System.out.println("Withdraw amount : 1000");
		System.out.println("After withdraw current Balance "+account.withdraw(1000));
		
		
	}
}
