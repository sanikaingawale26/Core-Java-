package com.pti.demo;

public class App {

	public static void main(String[] args) {
		// Nested loops
		for(int i=1;i<5;i++) {
			//j represents coloumns
			for (int j=1;j<5;j++) {
				System.out.print(j+" ");// values for coloumn
		}
			System.out.println();//new line character
		}
		for (int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		for (int i=1;i<5;i++) {
			System.out.print(i+" ->");
			for(int j=1;j<i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		

	}

}
