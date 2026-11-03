package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int num = 0;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number between range of 100 to 200");
			num = scanner.nextInt();
			System.out.println("Consider >=100 and <=200 boundry values");

			if (num >= 100 && num <= 200) {
				System.out.println(num + " is between range of 100 and 200");
			} else {
				System.out.println(num + " is not between range of 100 and 200");

			}
			System.out.println("Consider >=100 or <=200 boundry values");

			if (num >= 100 || num <= 200) {
				System.out.println(num + " is either >=100 or <=200 in between");
			} else {
				System.out.println(num + " is neither >=100 nor <=200 not in between");

			}
			scanner.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
