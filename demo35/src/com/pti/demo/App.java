package com.pti.demo;

import com.pti.demo.model.Product;

public class App {

	public static void main(String[] args) {
		//Java class creation with best practice
		//example of overload constructor with 3 argument
		System.out.println("Overload with 3 arguments");
		Product p1=new Product (1,"Maggie",20.0);
		System.out.println(p1);
		//Example of overload construtor with 2 argument
		System.out.println("Overload with 2 arguments");
		Product p2=new Product ("Masala Oats",20.0);
		System.out.println(p2);
		//Example of default constructor
		System.out.println("Default Constructor");
		p1=new Product();
		System.out.println(p1);
		
		
	}

}
