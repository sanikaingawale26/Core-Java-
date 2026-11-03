package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			int num1=0;
			int num2=0;
			int result=0;
			System.out.println("Enter num1:");
			num1=scanner.nextInt();
			System.out.println("Enter num2:");
			num2=scanner.nextInt();
			result=num1+num2;
			System.out.println(num1+" + "+num2+" = "+result);
			
			
			
			scanner.close();
			
			

			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
