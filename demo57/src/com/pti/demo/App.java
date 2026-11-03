package com.pti.demo;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		  int [] numbers= {20,30,44,5,6,7};
		  System.out.println(numbers.length);
		  System.out.println("numbers: ["
		    +numbers[0]+","
		    +numbers[1]+","
		    +numbers[2]+","
		    +numbers[3]+","
		    +numbers[4]+","
		    +numbers[5]+"]"
		    );
		//  numbers[6]=10;
		  
		  //Jdk1.5 Generics 
		  ArrayList<Integer> numbersList=new ArrayList<Integer>(4);
		  System.out.println("Total elements allowed: "+numbersList.size());
		  numbersList.add(1);
		  numbersList.add(12);
		  numbersList.add(12);
		  numbersList.add(13);
		  numbersList.add(1);
		  numbersList.add(14);
		  System.out.println("numbersList: "+numbersList.toString());
		  numbersList.remove(1);
		  System.out.println("Removes element at position 1 from numbersList: "+numbersList.toString());
		  numbersList.remove(new Integer(1));
		  System.out.println("Remove Integer object 1 numbersList: "+numbersList.toString());
		 }

		

	}


