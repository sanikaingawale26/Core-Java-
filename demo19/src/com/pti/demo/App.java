package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find bigger number using if
		// useOfIF();
		// input two numbers and compare it with ladder if-else
		int num1 = 0;
		int num2 = 0;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter num1:");
			num1 = scanner.nextInt();
			System.out.println("Enter num2:");
			num2 = scanner.nextInt();
			compareNumbers(num1, num2);
			scanner.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	private static void compareNumbers(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + ">" + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + "<" + num2);
		} else {
			System.out.println(num1 + "=" + num2);
		}

	}

	private static void useOfIF() {
		int a = 100;
		int b = 101;
		System.out.println("a>b=" + (a > b));
		if (a > b) {
			System.out.println("a>b");
		} else {
			System.out.println("a<b");
		}
	}

}
