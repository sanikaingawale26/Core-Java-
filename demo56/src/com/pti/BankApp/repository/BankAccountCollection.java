package com.pti.BankApp.repository;

import com.pti.BankApp.model.BankAccount;

public class BankAccountCollection {
	
	private static BankAccount [] accountList=new BankAccount[5];
	public BankAccountCollection() {
		super();
	}
	public String create (BankAccount account) {
		for(int i=0;i<accountList.length;i++) {
			if(accountList[i]==null) {
				accountList[i]=account;
				return account.getAccNo()+"crated.";
				
			}
		}
		return "Error:failed to create new account";
	}
	public boolean update(int accNo,String newAccName) {
		  BankAccount account=findAccount(accNo);
		  if(account!=null) {
		   account.setAccName(newAccName);
		   return true;
		  }
		  return false;
		 }

		 private BankAccount findAccount(int accNo) {
		  for(BankAccount account:accountList) {
		   if(account.getAccNo()==accNo) {
		    return account;
		   }
		  }
		  return null;
		 }
		 public void read() {
			  for(BankAccount account:accountList) {
			   System.out.println(account.getAccNo()+" | "+account.getAccName());
			  }
			 }
			 public boolean delete(int accNo) {
			  for(int i=0;i<accountList.length;i++) {
			   if(accountList[i].getAccNo()==accNo) {
			    accountList[i]=null;
			    return true;
			   }
			  }
			  return false;
			 }


}
