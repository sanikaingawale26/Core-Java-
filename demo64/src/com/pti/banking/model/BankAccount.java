package com.pti.banking.model;

import java.util.Objects;

public abstract class BankAccount implements IBankService{

	 private int accNO;
	 private String accName;
	 private double balance;
	 
	 private static int accNoCounter=0;
	 {
	  this.accNO=++accNoCounter;
	 }
	 public BankAccount() {
	  super();
	 }
	 public BankAccount(int accNO, String accName, double balance) {
	  super();
	  this.accNO = accNO;
	  this.accName = accName;
	  this.balance = balance;
	 }
	 public BankAccount(String accName, double balance) {
	  super();
	  this.accName = accName;
	  this.balance = balance;
	 }
	 public int getAccNO() {
	  return accNO;
	 }
	 public void setAccNO(int accNO) {
	  this.accNO = accNO;
	 }
	 public String getAccName() {
	  return accName;
	 }
	 public void setAccName(String accName) {
	  this.accName = accName;
	 }
	 public double getBalance() {
	  return balance;
	 }
	 public void setBalance(double balance) {
	  this.balance = balance;
	 }
	 @Override
	 public int hashCode() {
	  return Objects.hash(accNO);
	 }
	 @Override
	 public boolean equals(Object obj) {
	  if (this == obj)
	   return true;
	  if (obj == null)
	   return false;
	  if (getClass() != obj.getClass())
	   return false;
	  BankAccount other = (BankAccount) obj;
	  return accNO == other.accNO;
	 }

	 @Override
	 public String toString() {
	  return "BankAccount [accNO=" + accNO + ", accName=" + accName + ", balance=" + balance + "]";
	 }
	 @Override
	 public double deposite(double amount) {
	  this.balance=this.balance+amount;
	  return this.balance;
	 }
	 
	 
	 
	 
	}
