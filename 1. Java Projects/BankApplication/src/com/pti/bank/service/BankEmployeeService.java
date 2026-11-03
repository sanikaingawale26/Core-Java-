package com.pti.bank.service;

import java.util.List;
import java.util.Scanner;

import com.pti.bank.model.BankAccount;
import com.pti.bank.model.SavingAccount;
import com.pti.bank.repo.BankAccountRepo;

public class BankEmployeeService {

    BankAccountRepo repo;
    Scanner sc = new Scanner(System.in);

    public BankEmployeeService(BankAccountRepo repo) {
        this.repo = repo;
    }

    public void employeeMenu() {

        while (true) {

            System.out.println("\n--- EMPLOYEE MENU ---");
            System.out.println("1. Open New Account");
            System.out.println("2. Update Account Holder Details");
            System.out.println("3. Close Account");
            System.out.println("4. View Account Holder Details");
            System.out.println("5. Display All Account Holder Details");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                sc.nextLine();

                if (repo.findOne(accNo) != null) {
                    System.out.println("Account number already exists!");
                    break;
                }

                System.out.print("Enter Account Holder Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();

                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();

                if (balance < 0) {
                    System.out.println("Invalid balance!");
                    break;
                }

                SavingAccount account =
                    new SavingAccount(accNo, name, phone, balance);

                repo.save(account);
                break;

            case 2:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();
                sc.nextLine();

                BankAccount update = repo.findOne(accNo);

                if (update != null) {

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Phone Number: ");
                    phone = sc.nextLine();

                    update.setAccountHolderName(name);
                    update.setPhoneNumber(phone);

                    System.out.println("Details updated successfully!");

                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 3:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();

                repo.delete(accNo);
                break;

            case 4:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();

                BankAccount view = repo.findOne(accNo);

                if (view != null) {
                    view.display();
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 5:
                List<BankAccount> list = repo.findAll();

                if (list.isEmpty()) {
                    System.out.println("No accounts available!");
                } else {
                    for (BankAccount a : list) {
                        a.display();
                        System.out.println("----------------");
                    }
                }
                break;

            case 6:
                System.out.println("Employee Exit!");
                return;

            default:
                System.out.println("Invalid Choice!");
            }
        }
    }
}
