package com.pti.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		System.err.println("HashSet");
		  Set<Integer> oddNumbers=new HashSet<>();
		  oddNumbers.add(1);
		  oddNumbers.add(3);
		  oddNumbers.add(5);
		  oddNumbers.add(7);
		  oddNumbers.add(9);
		  oddNumbers.add(3);
		  oddNumbers.add(3);
		  System.out.println("oddNumbers: "+oddNumbers);
		  System.err.println("TreeSet");
		  Set<Integer> evenNumbers=new TreeSet<>();
		  evenNumbers.add(2);
		  evenNumbers.add(4);
		  evenNumbers.add(6);
		  evenNumbers.add(8);
		  evenNumbers.add(10);
		  evenNumbers.add(2);
		  System.out.println("evenNumbers: "+evenNumbers);
		  System.err.println("LinkedHashSet");
		  Set<Integer> primeNumbers=new LinkedHashSet<>();
		  primeNumbers.add(1);
		  primeNumbers.add(2);
		  primeNumbers.add(3);
		  primeNumbers.add(5);
		  primeNumbers.add(7);
		  primeNumbers.add(11);
		  System.out.println("primeNumbers: "+primeNumbers);
		  
		  
		 }

		}

	


