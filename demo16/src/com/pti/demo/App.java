package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			int num1 = 0;
			int num2 = 0;
			double result = 0.0;
			System.out.println("Enter num1:");
			num1 = scanner.nextInt();

			System.out.println("Enter num2:");
			num2 = scanner.nextInt();

			result=add(num1,num2);
			System.out.println(num1+" + "+num2+" = "+result);
			
			result=sub(num1,num2);
			System.out.println(num1+" - "+num2+" = "+result);
			
			result=mul(num1,num2);
			System.out.println(num1+" * "+num2+" = "+result);
			
			result=div(num1,num2);
			System.out.println(num1+" / "+num2+" = "+result);
			
			
			
			
			
			
			
			scanner.close();
			
		} catch (Exception e) {
			
			
		}

	}

	private static double mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	private static double sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	private static double add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	private static double div(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}


}
