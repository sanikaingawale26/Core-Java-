package com.pti.demo;

public class App {

	public static void main(String[] args) {
		// Entry Control -for
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("Reverse");
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Print first Five even number");
		// Even number%2==0
		int count = 1;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			} else {
				continue;
			}
			if (count == 5) {
				break;
			}
			count++;
		}
	}

}
