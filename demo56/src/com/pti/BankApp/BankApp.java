package com.pti.BankApp;

import java.util.Scanner;

import com.pti.BankApp.model.BankAccount;
import com.pti.BankApp.model.SavingAccount;
import com.pti.BankApp.repository.BankAccountCollection;
import com.pti.BankApp.service.BankAccountService;

public class BankApp {

 public static void main(String[] args) {
  BankAccountCollection repo=new BankAccountCollection();
  BankAccountService service=new BankAccountService(repo);
  try {
   Scanner scanner=new Scanner(System.in);
   int choice;
   do {
    System.out.println("\n#######  Bank Menu  ######");
    System.out.println("1. Create Account");
    System.out.println("2. Read Account");
    System.out.println("3. Update Account");
    System.out.println("4. Delete Account");
    System.out.println("5. Exit");
    System.out.println("Enter yoru choice");
    choice=Integer.parseInt(scanner.nextLine());
    switch(choice) {
    case 1: 
     System.out.println("Enter Account Holder Name");
     String accName=scanner.nextLine();
     BankAccount account=new SavingAccount(accName, 100000);
     service.create(account);
     break;
    case 2: 
     System.out.println("All Account holder accNo and name");
     service.read();
     break;
    case 3: 
     System.out.println("Enter Account no");
     int accNo=Integer.parseInt(scanner.nextLine());
     System.out.println("Enter Account New Name");
     String newAccName=scanner.nextLine();
     if(service.update(accNo, newAccName)) {
      System.out.println(accNo+"Details updated as ");      
     }else {
      System.out.println("Error: accNo does not exist");
     }
     break;
    case 4: 
     System.out.println("Enter Account no");
     int delAccNo=Integer.parseInt(scanner.nextLine());
     if(service.delete(delAccNo)) {
      System.out.println(delAccNo+" is closed now");
     }else {
      System.out.println("Error: accNo does not exist");
     }
     
     break;
    case 5: 
     System.out.println("Thank you for banking with us!!!!");
     break;
    }
   }while(choice!=5);
   scanner.close();
  } catch (Exception e) {
   e.printStackTrace();
  }
 } 
 

}
