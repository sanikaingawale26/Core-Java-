package com.pti.banking;

import java.util.Scanner;

import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SalaryAccount;
import com.pti.banking.model.SavingAccount;


public class BankApp {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		  BankAccount account=null;
		  while(true) {
		   System.out.println("Menu");
		   System.out.println("Choose BankAccount to be opened");
		   System.out.println("1. BankAccount");
		   System.out.println("2. SavingAccount");
		   System.out.println("3. SalaryAccount");
		   final int accountType=Integer.parseInt(scanner.nextLine());
		   switch(accountType) {
		   case 1: 
		     account=new BankAccount("John Doe", 100000);
		     break;
		   case 2: 
		     account=new SavingAccount("John Doe", 100000);
		     break;
		   case 3: 
		     account=new SalaryAccount("John Doe", 100000);
		     break;
		   default:
		     System.out.println("Invalid optin choose 1/2/3");
		     break;
		   }
		   System.out.println("New Account Details are: ");
		   System.out.println(account);
		   
		   
		   
		   System.out.println("Press Q to quite");
		   final String choice=scanner.nextLine();
		   if(choice.equalsIgnoreCase("q")) {
		    break;
		   }
		  }
		  scanner.close();
}
}
