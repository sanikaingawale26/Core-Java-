package com.pti.banking;

import java.util.Scanner;

import com.pti.banking.model.BankAccount;

public class Bankingapp {

	public static void main(String[] args) {
	    BankAccount account1=new BankAccount("John Deo",10000.00);
	    Scanner scanner=new Scanner(System.in);
	    boolean test=true;
	    while(test) {
		System.out.println("Choose the Operation");
		System.out.println("1.Check Balance");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Deposit Amount");
		final int choice=Integer.parseInt(scanner.nextLine());
		switch(choice) {
		case 1:
    		System.out.println("Balance is:"+account1.getBalance());
    		break;
		case 2:
			System.out.println("Enter amount of withdrawl");
			final double amount=Double.parseDouble(scanner.nextLine());
			final double currentBalance=account1.withdraw(amount);
			System.out.print("From accNo"+account1.getAccNo());
			System.out.print("is debited with"+amount);
			System.out.println("current balance is"+currentBalance);
			break;
		case 3:	
			System.out.println("Enter amount of deposit");
			final double depositAmount=Double.parseDouble(scanner.nextLine());
			final double currentBalance2=account1.deposit(depositAmount);
			System.out.print("From accNo"+account1.getAccNo());
			System.out.print("is credited with"+depositAmount);
			System.out.println("current balance is"+currentBalance2);
			break;
		default:
			System.out.println("Enter valid operations available 1 or 2 or 3 ");
			break;
		
		}
		System.out.println("Do you want to continue? press Y- Yes/N-No");
		final String ch=scanner.nextLine();
		if(ch.equalsIgnoreCase("N")) {
			test=false;
			System.out.println(" Happy to help.We are closing the transaction!");
		}
		
		
	}
	    scanner.close();

}
}
