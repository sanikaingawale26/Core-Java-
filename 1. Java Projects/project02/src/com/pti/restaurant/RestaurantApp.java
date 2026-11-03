package com.pti.restaurant;

import java.util.Scanner;

import com.pti.restaurant.model.Pasta;
import com.pti.restaurant.model.RedPasta;
import com.pti.restaurant.model.WhitePasta;

public class RestaurantApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("******** Restaurant Billing System ********");

        System.out.println("1. White Pasta");
        System.out.println("2. Red Pasta");

        System.out.print("Choose your Pasta : ");

        int choice = scanner.nextInt();

        Pasta p;

        switch (choice) {

        case 1:

            p = new WhitePasta("White Pasta", 200, 50);

            System.out.println("\nYou selected " + p.getPastaName());
            System.out.println("Base Price : 200");
            System.out.println("GST : 18%");
            System.out.println("White Sauce : 50");
            System.out.println("Total Cost : " + p.calculatePrice());

            break;

        case 2:

            p = new RedPasta("Red Pasta", 200, 50);

            System.out.println("\nYou selected " + p.getPastaName());
            System.out.println("Base Price : 200");
            System.out.println("GST : 18%");
            System.out.println("Red Sauce : 50");
            System.out.println("Total Cost : " + p.calculatePrice());

            break;

        default:

            System.out.println("Invalid Choice");
        }

        scanner.close();

    }

}