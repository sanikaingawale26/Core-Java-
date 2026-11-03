package com.pti.BankApp;


	import com.pti.BankApp.model.BankAccount;
   import com.pti.BankApp.model.IBankService;
   import com.pti.BankApp.model.SavingAccount;

	public class App1 {

	 public static void main(String[] args) {
	  System.out.println("CALLS Maintain minimum balance exception: ");
	  IBankService bankService=new SavingAccount("John Doe",12345.00);
	  System.out.println("Withdraw 12345 from accNo:" + ((BankAccount) bankService).getAccNo());
	  double remianingBalance1 = bankService.withdraw(12345.0);
	  System.out.println("Current balance: " + remianingBalance1);

	 }

	}



