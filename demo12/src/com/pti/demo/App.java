package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your Name:");
			String name=scanner.next();
			System.out.println("Welcome"+name+"!!");
			scanner.close();
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
		}

	}


