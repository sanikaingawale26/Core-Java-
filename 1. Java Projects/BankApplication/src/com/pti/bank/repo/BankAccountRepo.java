package com.pti.bank.repo;


	import java.util.ArrayList;
	import java.util.List;

	import com.pti.bank.model.BankAccount;

	public class BankAccountRepo implements IRepository {

	    ArrayList<BankAccount> accounts = new ArrayList<>();

	    @Override
	    public void save(BankAccount account) {
	        accounts.add(account);
	        System.out.println("Account opened successfully!");
	    }

	    @Override
	    public BankAccount findOne(int accountNumber) {

	        for (BankAccount account : accounts) {

	            if (account.getAccountNumber() == accountNumber) {
	                return account;
	            }
	        }

	        return null;
	    }

	    @Override
	    public List<BankAccount> findAll() {
	        return accounts;
	    }

	    @Override
	    public void delete(int accountNumber) {

	        BankAccount account = findOne(accountNumber);

	        if (account != null) {
	            accounts.remove(account);
	            System.out.println("Account closed successfully!");
	        } else {
	            System.out.println("Account not found!");
	        }
	    }
	}


