package com.pti.BankApp;

import java.util.Scanner;

import com.pti.BankApp.model.BankAccount;
import com.pti.BankApp.model.SavingAccount;

public class BankApp {

 private static final BankAccount [] accountList=new SavingAccount[5];
 static {
  accountList[0]=new SavingAccount("Alice",10000.00);
  accountList[1]=new SavingAccount("Jeff", 10000.00);
  accountList[2]=new SavingAccount("Bob",  10000.00);
  accountList[3]=new SavingAccount("Alen", 10000.00);
  accountList[4]=new SavingAccount("Jack", 10000.00);
 }
 public static void main(String[] args) {
  boolean test=true;
  try {
   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter your BankAccount no: ");
   final int accNo=Integer.parseInt(scanner.nextLine());
   //find account by accNo
   BankAccount account=findAccount(accNo);
   if(account==null) {
    throw new NullPointerException("Account No not avaialble ");
   }
   while(test) {
    
    System.out.println("Welcome "+account.getAccName());
    //Show the options
    System.out.println("Choose Operations from below list: ");
    System.out.println("1. CheckBalance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    
    int choice=Integer.parseInt(scanner.nextLine());
    switch(choice) {
    case 1:
     System.out.println("Current Balance is: "+account.getBalance());
     break;
    case 2:
     System.out.println("Enter deposite amount:");
     final double depositAmt=Double.parseDouble(scanner.nextLine());
     System.out.println("Deposited :"+depositAmt);
     System.out.println("Current Balance: "+account.deposit(depositAmt));
     break;
    case 3:
     System.out.println("Enter withdraw amount:");
     final double withdrawAmt=Double.parseDouble(scanner.nextLine());
     System.out.println("Withdrawed :"+withdrawAmt);
     System.out.println("Current Balance: "+account.withdraw(withdrawAmt));    
     break;
    default:
     System.out.println("Enter valid operations.");     
     break;    
    }
    System.out.println("Press any key to continue. Press q for Exit");
    String exitQ=scanner.nextLine();
    if(exitQ.equalsIgnoreCase("q")) {
     test=false;
     System.out.println("Thank you for choosing our App "+account.getAccName()+".");
     
    }
   }
   scanner.close();
  } catch (Exception e) {
   
   e.printStackTrace();
  }
 }
 
 private static BankAccount findAccount(int accNo) {
  for(BankAccount account: accountList) {
   if(account.getAccNo()==accNo) {
    return account;
   }
  }
  return null;
 }

 public static void displayAllAccountHolderNames() {
   
  for(BankAccount account:accountList) {
   System.out.println(account.getAccNo()+" | "+account.getAccName());
  }
 
 }

}
