
package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int actualScore = 0;
			int totalScore = 0;
			double percentage = 0.0;
			System.out.println("Enter Total Score");
			totalScore = scanner.nextInt();

			System.out.println("Enter Actual Score:");
			actualScore = scanner.nextInt();

			percentage = (actualScore * 100) / totalScore;
			System.out.println(actualScore + "/" + totalScore + "=" + percentage + "%");

			scanner.close();
		} catch (Exception e) {

		}

	}
}
