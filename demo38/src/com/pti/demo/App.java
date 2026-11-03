package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean test=true;
		while(test) {
			System.out.println("Loop Started");
			
			System.out.println("Enter odd Number");
			final int oddNumber=Integer.parseInt(scanner.nextLine());
			
			System.out.println("Enter double Number");
			final double doubleNumber=Double.parseDouble(scanner.nextLine());
			
			System.out.println("Enter Float Number");
			final float floatNumber=Float.parseFloat(scanner.nextLine());
			
			System.out.println("Odd Number:"+oddNumber);
			System.out.println("Double Number:"+doubleNumber);
			System.out.println("Float Number:"+floatNumber);
			
			System.out.println("Do you want to contine?y/n");
			final String choice=scanner.nextLine();
			if(choice.equalsIgnoreCase("N")) {
				System.out.println("Ending the loop");
			}
			
			}
		scanner.close();
		
	}

}
