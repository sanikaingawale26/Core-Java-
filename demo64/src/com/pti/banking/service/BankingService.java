package com.pti.banking.service;

import java.util.List;

import com.pti.banking.model.BankAccount;
import com.pti.banking.repository.BankAccountRepository;

public class BankingService implements IBankingService<BankAccount> {

 private static final BankAccountRepository repository=new BankAccountRepository();
 @Override
 public String create(BankAccount account) {
  
  return repository.create(account);
 }

 @Override
 public String update(BankAccount newAccout) {

  return repository.update(newAccout);
 }

 @Override
 public String delete(BankAccount account) {

  return repository.delete(account);
 }

 @Override
 public List<BankAccount> findAll() {

  return repository.findAll();
 }

 @Override
 public BankAccount findOne(int accNo) {

  return repository.findOne(accNo);
 }

 
 
}
