package com.pti.BankApp;

import com.pti.BankApp.model.BankAccount;
import com.pti.BankApp.model.IBankService;
import com.pti.BankApp.model.SalaryAccount;
import com.pti.BankApp.model.SavingAccount;

public class BankApp {

 public static void main(String[] args) {
  IBankService bankService=new SavingAccount("John Doe",12345.00);
  System.out.println(bankService);
  
  try {
   
   System.out.println("Withdraw 13000.0 from accNo:"+((BankAccount)bankService).getAccNo());
   double remianingBalance=bankService.withdraw(12345.0);
   System.out.println("Current balance: "+remianingBalance);
  } catch (Exception e) {
   
   System.out.println(e.getClass().getName()+":\n"+e.getMessage());
   e.printStackTrace();
  }
  
  bankService=new SalaryAccount("Abby John",12345.00);
  System.out.println(bankService);
  
  try {
   System.out.println("Withdraw 13000.0 from accNo:"+ ((BankAccount)bankService).getAccNo());
   double remianingBalance=bankService.withdraw(13000.0);
   System.out.println("Current balance: "+remianingBalance);
  } catch (Exception e) {
   
   System.out.println(e.getClass().getName()+":\n"+e.getMessage());
   e.printStackTrace();
  }

 }

}

