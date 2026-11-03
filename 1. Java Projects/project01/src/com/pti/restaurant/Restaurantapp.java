package com.pti.restaurant;

import java.util.Scanner;

import com.pti.restaurant.model.Pasta;
import com.pti.restaurant.model.Redpasta;
import com.pti.restaurant.model.Whitepasta;

public class Restaurantapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("******** Restaurant Billing System ********");

        System.out.println("1. Pasta");
        System.out.println("2. White Pasta");
        System.out.println("3. Red Pasta");

        System.out.print("Choose your Pasta : ");

        int choice = scanner.nextInt();

        Pasta p;

        switch (choice) {

        case 1:

            p = new Pasta("Basic Pasta", 200);

            System.out.println();

            System.out.println("You selected " + p.getPastaName());

            System.out.println("Base Price : 200");

            System.out.println("GST : 18%");

            System.out.println("Total Cost : " + p.calculatePrice());

            break;

        case 2:

            p = new Whitepasta("White Pasta", 200, 50);

            System.out.println();

            System.out.println("You selected " + p.getPastaName());

            System.out.println("Base Price : 200");

            System.out.println("GST : 18%");

            System.out.println("White Sauce : 50");

            System.out.println("Total Cost : " + p.calculatePrice());

            break;

        case 3:

            p = new Redpasta("Red Pasta", 200, 50);

            System.out.println();

            System.out.println("You selected " + p.getPastaName());

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