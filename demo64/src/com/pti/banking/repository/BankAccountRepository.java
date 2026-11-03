package com.pti.banking.repository;

import java.util.ArrayList;
import java.util.List;

import com.pti.banking.model.BankAccount;

public class BankAccountRepository implements IRepository<BankAccount>{

 private List<BankAccount> accountList=new ArrayList<>();

 @Override
 public String create(BankAccount account) {
  accountList.add(account);
  return "New Account created: "+account;
 }

 @Override
 public String update(BankAccount newAccount) {
  // first check if the account is available in the list
	 BankAccount originalAccount=findOne(newAccount.getAccNO());
// update it if available
	  originalAccount.setAccName(newAccount.getAccName());
	  originalAccount.setBalance(newAccount.getBalance());

  return null;
 }

 @Override
 public String delete(BankAccount account) {
	  if(accountList.remove(account))
	   return account+" is closed";
	  return account+" is not closed";
	 }

  @Override
  public List<BankAccount> findAll() {
	  
	  return accountList;
	 }


 @Override
 public BankAccount findOne(int accNo) {
	  for(BankAccount account : accountList) {
	   if(account.getAccNO()==accNo) {
	    return account;
	   }
	  }
	  return null;
	 }
}
