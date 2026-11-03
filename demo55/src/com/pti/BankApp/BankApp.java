package com.pti.BankApp;

import com.pti.BankApp.collection.BankAccountList;
import com.pti.BankApp.model.BankAccount;
import com.pti.BankApp.model.SavingAccount;

public class BankApp {
 
 public static void main(String[] args) {
  String message="";
  BankAccountList accounts=new BankAccountList();
  System.out.println("Creating 5 Saving Accounts");
  
  BankAccount account=new SavingAccount("Alice",10000.00);
  message=accounts.createAccount(account);
  System.out.println(message);
  
  account=new SavingAccount("Jeff", 10000.00);
  message=accounts.createAccount(account);
  System.out.println(message);
  
  account=new SavingAccount("Bob",  10000.00);
  message=accounts.createAccount(account);
  System.out.println(message);
  
  account=new SavingAccount("Alen", 10000.00);
  message=accounts.createAccount(account);
  System.out.println(message);
  
  account=new SavingAccount("Jack", 10000.00);
  message=accounts.createAccount(account);
  System.out.println(message);
//Below object wont be added in the account list as limit is over 
  account=new SavingAccount("Sam", 10000.00);
  message=accounts.createAccount(account);
  System.out.println(message);

  
  System.out.println("Display all BankAccounts created in the Bank");
  accounts.readAccount();
 }
}
