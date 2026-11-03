package com.pti.bankApp;

import java.util.Scanner;

import com.pti.bank.repo.BankAccountRepo;
import com.pti.bank.service.BankAccountService;
import com.pti.bank.service.BankEmployeeService;

public class bankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccountRepo repo = new BankAccountRepo();

        BankEmployeeService employeeService =
                new BankEmployeeService(repo);

        BankAccountService accountService =
                new BankAccountService(repo);

        while (true) {

            System.out.println("\n===== BANK APPLICATION =====");
            System.out.println("1. Login as Employee");
            System.out.println("2. Login as Account Holder");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                employeeService.employeeMenu();
                break;

            case 2:

                while (true) {

                    System.out.println("\n--- ACCOUNT HOLDER MENU ---");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");

                    System.out.print("Enter Choice: ");
                    int ch = sc.nextInt();

                    if (ch == 4) {
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    switch (ch) {

                    case 1:
                        accountService.checkBalance(accNo);
                        break;

                    case 2:
                        System.out.print("Enter Deposit Amount: ");
                        double deposit = sc.nextDouble();

                        accountService.deposit(accNo, deposit);
                        break;

                    case 3:
                        System.out.print("Enter Withdraw Amount: ");
                        double withdraw = sc.nextDouble();

                        accountService.withdraw(accNo, withdraw);
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                    }
                }
                break;

            case 3:
                System.out.println("Thank You!");
                sc.close();
                return;

            default:
                System.out.println("Invalid Choice!");
            }
        }
    }
}
