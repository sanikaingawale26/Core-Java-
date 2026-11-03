package com.pti.bank.service;

import com.pti.bank.model.BankAccount;
import com.pti.bank.model.IBankService;
import com.pti.bank.repo.BankAccountRepo;

public class BankAccountService implements IBankService {

    BankAccountRepo repo;

    public BankAccountService(BankAccountRepo repo) {
        this.repo = repo;
    }

    @Override
    public void checkBalance(int accountNumber) {

        BankAccount account = repo.findOne(accountNumber);

        if (account != null) {
            System.out.println("Available Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    @Override
    public void deposit(int accountNumber, double amount) {

        BankAccount account = repo.findOne(accountNumber);

        if (account != null) {

            if (amount > 0) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Amount deposited successfully!");
                System.out.println("New Balance: " + account.getBalance());
            } else {
                System.out.println("Invalid amount!");
            }

        } else {
            System.out.println("Account not found!");
        }
    }

    @Override
    public void withdraw(int accountNumber, double amount) {

        BankAccount account = repo.findOne(accountNumber);

        if (account != null) {

            if (amount > 0 && amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                System.out.println("Amount withdrawn successfully!");
                System.out.println("Remaining Balance: " + account.getBalance());
            } else {
                System.out.println("Invalid amount or insufficient balance!");
            }

        } else {
            System.out.println("Account not found!");
        }
    }
}
	


