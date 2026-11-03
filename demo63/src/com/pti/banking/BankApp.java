package com.pti.banking;
import java.util.List;

import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SavingAccount;
import com.pti.banking.service.BankingService;

public class BankApp {

 public static void main(String[] args) {
  BankingService bankingService=new BankingService();
  bankingService.create(new SavingAccount("John doe", 10000.00));
  bankingService.create(new SavingAccount("Alice doe", 10000.00));
  bankingService.create(new SavingAccount("Bob doe", 10000.00));
  bankingService.create(new SavingAccount("Allen doe", 10000.00));
  bankingService.create(new SavingAccount("Allen Pit", 10000.00));
  List<BankAccount> list=bankingService.findAll();
  for(BankAccount account: list) {
   System.out.println(account+" hashCode: "+account.hashCode());
  }
  bankingService.create(new SavingAccount("Tim Smith", 10000.00));
  System.out.println("###\n"+bankingService.findOne(6)+ "hashCode: "+bankingService.findOne(6).hashCode());
  //Lambda=>Stream API->JDK 8
  System.out.println("Using Stream API of JDK 8");
  bankingService.findAll().stream().forEach(System.out::println);
  
  System.out.println("Before Update:\n"+bankingService.findOne(5));
  
  BankAccount account=new SavingAccount(5,"Allen Pole", 10000.00);
  System.out.println("account - refering accNo 5 "+account);
  System.out.println("account - refering accNo 5 "+account.hashCode());
  bankingService.update(account);
  System.out.println("After Update:\n"+bankingService.findOne(5));
  bankingService.findAll().stream().forEach(System.out::println);
  
  System.out.println("Close account no. 5");
  System.out.println(bankingService.delete(account));
  System.out.println("After delete the accountlist is:");
  bankingService.findAll().stream().forEach(System.out::println);
  
 }

}
