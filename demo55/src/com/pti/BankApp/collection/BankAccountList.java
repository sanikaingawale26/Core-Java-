
	package com.pti.BankApp.collection;

	import com.pti.BankApp.model.BankAccount;

	public class BankAccountList {

	 private static final BankAccount [] accountList=new BankAccount[5];
	 
	 public BankAccountList() {
	  
	 }
	 
	 public String createAccount(BankAccount account) {
	  
	  for(int i=0;i<accountList.length;i++) {
	   if(accountList[i]==null) {
	    accountList[i]=account;
	    return account.getAccNo()+" created";
	   }
	  }
	  return "Error: new account not created";
	 } 
	 
	 
	 public void readAccount() {
	  for(BankAccount account:accountList) {
	   System.out.println(account);
	  }
	 }
	}



