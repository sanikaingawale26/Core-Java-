package com.pti.BankApp.service;

import com.pti.BankApp.model.BankAccount;
import com.pti.BankApp.repository.BankAccountCollection;

public class BankAccountService {

 private BankAccountCollection repo;

 public BankAccountService() {
  super();
  repo=new BankAccountCollection();
 }

 public BankAccountService(BankAccountCollection repo) {
  super();
  this.repo = repo;
 }
 
 public String create(BankAccount account) {
  
  return repo.create(account);
 }
 
 public boolean update(int accNo,String newName) {
  return repo.update(accNo, newName);
 }
 
 public boolean delete(int accNo) {
  return repo.delete(accNo);  
 }
 
 public void read() {
  repo.read();
 }
}
