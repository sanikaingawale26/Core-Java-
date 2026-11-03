package com.pti.BankApp;

import com.pti.BankApp.model.BankAccount;
import com.pti.BankApp.model.SavingAccount;

public class BankApp {
	 public static void main(String[] args) {
		  // Array of BankAccount 
		  try {
		//   int [] numbers=new int[5];
		   BankAccount [] accountList=new SavingAccount[5];
		//   below is the way of 5 SavingAccount reference variable
		   //these 5 will be at different location in memeory
		//   BankAccount account1=new SavingAccount("Alice",10000.00);
		//   BankAccount account2=new SavingAccount("Jeff", 10000.00);
		//   BankAccount account3=new SavingAccount("Bob",  10000.00);
		//   BankAccount account4=new SavingAccount("Alen", 10000.00);
		//   BankAccount account5=new SavingAccount("Jack", 10000.00);
		   
		   
		//   Initialization of SavingAccount object Array
		//   accountList=>[0|1|2|3|4]=>all these are located in one block of memory
		   //to access them we will index position
		   accountList[0]=new SavingAccount("Alice",10000.00);
		   accountList[1]=new SavingAccount("Jeff", 10000.00);
		   accountList[2]=new SavingAccount("Bob",  10000.00);
		   accountList[3]=new SavingAccount("Alen", 10000.00);
		   accountList[4]=new SavingAccount("Jack", 10000.00);
		   System.out.println("Display all bank Accounts");
		   for(BankAccount account:accountList) {
		    System.out.println(account);
		   }
		   
		  } catch (Exception e) {
		   e.printStackTrace();
		  }

		 }

		}



