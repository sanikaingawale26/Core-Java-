package com.pti.bank.model;

public interface IBankService {
	void checkBalance(int accountNumber);

    void deposit(int accountNumber, double amount);

    void withdraw(int accountNumber, double amount);

}
