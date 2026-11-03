package com.pti.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

 public static void main(String[] args) {

  System.out.println("Program Started....");
//  ArithmaticException
  arithmaticExceptionDemo();
//  NullPointerException
  nullPointerExceptionDemo();
//  ArrayIndexOutOfBoundException  
  arrayIndexOutOfBoundsExceptionDemo();
//  NumberFormatException
  numberFormatExceptionDemo();
  
//  InputMismatchException
  inputMismatchExceptionDemo();
  
  System.out.println("Program Contines....");
 }

 private static void inputMismatchExceptionDemo() {
  try {
   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter the Leap year:");
   int leapYear=scanner.nextInt();
   System.out.println("Leap year:"+leapYear);
   scanner.close();
  } catch (InputMismatchException ime) {
   System.out.println("Enter valid integer as leap year");
  }
 }

 private static void numberFormatExceptionDemo() {
  try {
   String strNumber="ABC";
   int number=Integer.parseInt(strNumber);
  } catch (NumberFormatException e) {
   System.out.println("Provide a valid String alphanumeric values not allowed.");
  }
 }

 private static void arrayIndexOutOfBoundsExceptionDemo() {
  try {
   int arr[]= {10,20,30,40};
   System.out.println("arr[4]"+arr[4]);
   
  } catch ( ArrayIndexOutOfBoundsException  ae) {
   System.out.println("Provide valid index from 0 to 3");
  }
 }

 private static void nullPointerExceptionDemo() {
  try {
   String name=null;
   System.out.println("Length of name:"+name.length());
  } catch (NullPointerException ne) {
   System.out.println("Intiaized name with proper value instead of null");
  }
 }

 private static void arithmaticExceptionDemo() {
  try {
   final int a=10;
   final int b=0;
   System.out.println(a/b);
  } catch (ArithmeticException  ae) {
   System.out.println("Can not divide by zero");
  }
 }

}