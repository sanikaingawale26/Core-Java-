package com.pti.BankApp;

import com.pti.BankApp.model.IBankService;
import com.pti.BankApp.model.SavingAccount;

public class BankApp {

	public static void main(String[] args) {
		IBankService bankService=new SavingAccount("John Doe",12345.00);
		  System.out.println(bankService);
		  System.out.println("Withdraw 12345.0 from accNo 1");
		  try {
		   double remianingBalance=bankService.withdraw(12345.0);
		   System.out.println("Current balance: "+remianingBalance);
		  } catch (Exception e) {
		   
		   System.out.println(e.getMessage());
		  }
		  

		 }

		
	}


