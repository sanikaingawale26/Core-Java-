package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Arithmetic exception
		//numberFormatException();
		inputMismatchException();
		  System.out.println("Line 07");
		  System.out.println("Line 08");
		  System.out.println("Line 09");
		//  arithmaticException();
		//  nullPointerException();
		  System.out.println("Line 11");
		  System.out.println("Line 12");
		  System.out.println("Line 12");
		  

		 }
	     public static void numberFormatException() {
	    	 final String str="ABC";
	    	 final int number=Integer.parseInt(str);
	    	 System.out.println("Str:"+str);
	    	 System.out.println("Number:"+number);
	     }
		 public static void arrayIndexOutOfBoundException() {
		  int [] arr= {10,20,30,40};//n=4 length=4 index=0-3 =>0-n-1
		  System.out.println(arr[0]);
		  System.out.println(arr[1]);
		  System.out.println(arr[2]);
		  System.out.println(arr[3]);
		  System.out.println(arr[6]);
		  
		 }
		 public static void inputMismatchException() {
			  Scanner scanner=new Scanner(System.in);
			  System.out.println("Enter your Birth year: ");
			  int year=scanner.nextInt();
			  System.out.println("You entered your Birth year as: "+year);
			  scanner.close();
			 }
		 
		 public static void nullPointerException() {
		  String name=null;
		  System.out.println(name.length());
		  
		 }
		 public static void arithmaticException() {
		  final int a=10;
		  final int b=0;
		  System.out.println(a/b);
		  
	}

}
