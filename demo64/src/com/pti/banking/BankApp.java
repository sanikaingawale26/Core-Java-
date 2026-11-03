package com.pti.banking;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SavingAccount;
import com.pti.banking.service.BankingService;

public class BankApp {
 private static final BankingService bankingService = new BankingService();

 public static void main(String[] args) {

  bankingService.create(new SavingAccount("John doe", 10000.00));
  bankingService.create(new SavingAccount("Alice doe", 10000.00));
  bankingService.create(new SavingAccount("Bob doe", 10000.00));
  bankingService.create(new SavingAccount("Allen doe", 10000.00));
  bankingService.create(new SavingAccount("Allen Pit", 10000.00));
  Scanner scanner = new Scanner(System.in);
  int i = 1;
  do {
   System.out.println("Welcome!");
   System.out.println("Choose Operrations from below list:");
   System.out.println("1. Create a New Account");
   System.out.println("2. Update a Account Details (Name and Balance)");
   System.out.println("3. Close Account (Delete)");
   System.out.println("4. Display all Accounts");
   System.out.println("5. Check Balance");
   System.out.println("6. Withdraw Amount");
   System.out.println("7. Deposit");
   int menuChoice = Integer.parseInt(scanner.nextLine());
   switch (menuChoice) {
   case 1:
    createAccount(scanner);
    break;
   case 2:
    udpateAccount(scanner);
    break;
   case 3:
    closeAccount(scanner);
    break;
   case 4:
    bankingService.findAll().stream().forEach(System.out::println);
    break;
   case 5:
    displayAccountDetails(scanner);
    break;
   case 6:
    transaction(scanner,"Withdraw");
    break;
   case 7:
    transaction(scanner,"Deposit");
    break;
   default:
    System.out.println("Enter valid options");
    break;
   }
   i++;
  } while (i < 4);

  scanner.close();

 }

 private static void transaction(Scanner scanner, String operation) {
  System.out.println("Enter your accNo:");
  final int accNo = Integer.parseInt(scanner.nextLine());
  BankAccount account = bankingService.findOne(accNo);
  double amount=0;
  double currentBalance=0.0;
  switch(operation) {
  case "Withdraw": 
   System.out.println("Enter amount to be withdrawn:");
   amount=Double.parseDouble(scanner.nextLine());
   try {
    currentBalance=account.withdraw(amount);
    System.out.println(account.getAccNO()+" debited by "+amount);
    System.out.println("on "+LocalDate.now() );
    System.out.println(" current balance is: "+account.getBalance());
   } catch (Exception e) {
    System.out.println("Error: "+e.getMessage());
   }
   break;
  case "Deposit":
   System.out.println("Enter amount to be deposited:");
   amount=Double.parseDouble(scanner.nextLine());
   currentBalance=account.deposite(amount);
   System.out.println(account.getAccNO()+" credited by "+amount);
   System.out.println("on "+LocalDate.now() );
   System.out.println(" current balance is: "+account.getBalance());
   break;
  default:
    System.out.println("Invalid operation");
    break;
  }
  
 }

 private static void displayAccountDetails(Scanner scanner) {
  System.out.println("Enter your accNo:");
  final int accNo = Integer.parseInt(scanner.nextLine());
  BankAccount account = bankingService.findOne(accNo);
  System.out.println("For "+account.getAccNO());
  System.out.println("Balance is: "+account.getBalance());
  
 }

 private static void closeAccount(Scanner scanner) {
  System.out.println("Enter your accNo:");
  final int accNo = Integer.parseInt(scanner.nextLine());
  BankAccount account = bankingService.findOne(accNo);
  System.out.println(bankingService.delete(account));

 }

 private static void udpateAccount(Scanner scanner) {
  System.out.println("Enter your accNo:");
  final int accNo = Integer.parseInt(scanner.nextLine());
  BankAccount account = bankingService.findOne(accNo);
  System.out.println("Enter your updated Name:");
  final String accName = scanner.nextLine();
  account.setAccName(accName);
  System.out.println(bankingService.update(account));

 }

 private static void createAccount(Scanner scanner) {
  System.out.println("Enter your name: ");
  final String accName = scanner.nextLine();
  BankAccount account = new SavingAccount(accName, 1000);
  String message = bankingService.create(account);
  System.out.println(message);
 }

}
