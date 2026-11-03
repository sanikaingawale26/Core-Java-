package com.pti.collection.demo;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

 public static void main(String[] args) {
  int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11 };
  Set<Integer> oddNumbers = new HashSet<>();
  Set<Integer> evenNumbers = new TreeSet<>();
  Set<Integer> primeNumbers = new LinkedHashSet<>();
  for (int num : numbers) {
   if (num % 2 == 0) {
    evenNumbers.add(num);
   } else {
    oddNumbers.add(num);
   }
   if (isPrime(num)) {
    primeNumbers.add(num);
   }

  }
  System.out.println("Original Array: ");
  for (int num : numbers) {
   System.out.print(num + ",");
  }
  System.out.println("\nOdd Numbers:" + oddNumbers);
  System.out.println("Even Numbers:" + evenNumbers);
  System.out.println("Prime Numbers:" + primeNumbers);

  // System.out.println(Math.sqrt(5));
  // System.out.println(Math.sqrt(6));
  // System.out.println(Math.sqrt(15));
  // System.out.println(Math.sqrt(25));
  
  
  oddNumbers.remove(5);
  evenNumbers.remove(4);
  primeNumbers.remove(5);
  System.out.println("Reomv # from each Set");
  System.out.println("\nOdd Numbers:" + oddNumbers);
  System.out.println("Even Numbers:" + evenNumbers);
  System.out.println("Prime Numbers:" + primeNumbers);
  oddNumbers.add(5);
  evenNumbers.add(4);
  primeNumbers.add(5);
  System.out.println("Add # from each Set");
  System.out.println("\nOdd Numbers:" + oddNumbers);
  System.out.println("Even Numbers:" + evenNumbers);
  System.out.println("Prime Numbers:" + primeNumbers);
  
  if(oddNumbers.contains(5)) {
   oddNumbers.remove(5);
   oddNumbers.add(15);
  }
  if(evenNumbers.contains(4)) {
   evenNumbers.remove(4);
   evenNumbers.add(14);
  }
  if(primeNumbers.contains(11)) {
   primeNumbers.remove(11);
   primeNumbers.add(19);
  }
  System.out.println("replace #1 with another #2");
  System.out.println("\nOdd Numbers:" + oddNumbers);
  System.out.println("Even Numbers:" + evenNumbers);
  System.out.println("Prime Numbers:" + primeNumbers);
  
 }

 private static boolean isPrime(int num) {
  if (num <= 1) {
   return true;
  }
  for (int i = 2; i <= Math.sqrt(num); i++) {
   if (num % i == 0) {
    return false;
   }
  }
  return true;
 }

}
