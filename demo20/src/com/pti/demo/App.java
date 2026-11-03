package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Display the signal colour name
		// using switch
		String colour= "RED";
		try {
			System.out.println("Choose colour from below name");
			System.out.println("1.RED");
			System.out.println("2.GREEN");
			System.out.println("3.YELLOW");
			System.out.println("Enter colour to get message");
			Scanner scanner=new Scanner(System.in);
			colour=scanner.nextLine();
			colour=colour.toUpperCase();
			scanner.close();
			switch(colour) {
			case "RED":
				System.out.println("STOP");
				break;
			case "GREEN":
				System.out.println("GO");
				break;
			case "YELLOW":
				System.out.println("SLow Down");
	            break;
			default:
				System.out.println("PLease enter valid colour of Signal");
				break;
			

			
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
