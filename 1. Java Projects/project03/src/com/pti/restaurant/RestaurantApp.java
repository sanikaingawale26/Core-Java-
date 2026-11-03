package com.pti.restaurant;

import java.util.Scanner;

import com.pti.restaurant.model.Pasta;
import com.pti.restaurant.model.WhitePasta;

public class RestaurantApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pasta[] cart = new Pasta[3];

        int count = 0;
        char choice;

        do {

            if (count == 3) {
                System.out.println("Cart is Full! Maximum 3 Pasta allowed.");
                break;
            }

            System.out.println("\n******** Restaurant Billing System ********");
            System.out.println("1. White Pasta");
            System.out.print("Choose your Pasta: ");

            int option = scanner.nextInt();

            switch (option) {

            case 1:

                cart[count] = new WhitePasta("White Pasta", 200, 50);

                System.out.println("You selected White Pasta");
                System.out.println("Base Price : 200");
                System.out.println("GST : 18%");
                System.out.println("White Sauce : 50");
                System.out.println("Total Cost : " + cart[count].calculatePrice());

                count++;
                break;

            default:
                System.out.println("Invalid Choice");
            }

            if (count < 3) {
                System.out.print("Do you want to add one more pasta? (y/n): ");
                choice = scanner.next().charAt(0);
            } else {
                choice = 'n';
            }

        } while (choice == 'y' || choice == 'Y');

        double total = 0;

        System.out.println("\n========== BILL ==========");
        System.out.println("Name\t\tQuantity\tUnit Price");

        for (int i = 0; i < count; i++) {

            System.out.println(cart[i].getPastaName() + "\t1\t\t" + cart[i].calculatePrice());

            total += cart[i].calculatePrice();

        }

        System.out.println("----------------------------");
        System.out.println("Total Cost : " + total);

        scanner.close();
    }
}