package com.pti.demo;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class App {

 public static void main(String[] args) {
//  exceptionType1();
  System.out.println("Program Started....");
  try {
   System.out.println("        try block started          ");

   if (true) {
    throw new FileNotFoundException("File Nout found");
//    throw new InputMismatchException("Invalid input");
   }
    

   System.out.println("/ by Zero: " + (10 / 0));
   System.out.println("Numberformat: " + Integer.parseInt("A200"));
   final String name = null;
   System.out.println("Nullpointer exception: " + name.length());
   final int[] numbers = { 1, 2, 3, 4, 5 };
   System.out.println("ArrayIndexOutOfBound exception: " + numbers[6]);
   System.out.println("        try block ended          ");

  } catch (ArithmeticException e) {
   System.out.println("ArithmeticException:" + e.getMessage());
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("ArrayIndexOutOfBoundsException:" + e.getMessage());
  } catch (NullPointerException e) {
   System.out.println("NullPointerException:" + e.getMessage());
  } catch (NumberFormatException e) {
   System.out.println("NumberFormatException:" + e.getMessage());
  } catch (InputMismatchException e) {
   System.out.println("InputMismatchException:" + e.getMessage());
  } catch (Exception e) {
   System.out.println("Exception:" + e.getMessage());
  }finally {
   System.out.println();
  }

  System.out.println("Program Contines....");
 }

 private static void exceptionType1() {
  System.out.println("Program Started....");
  try {
   System.out.println("try block started....");
   final int a = 10;
   final int b = 0;
   System.out.println(a / b);

   System.out.println("try block ended....");
  } catch (Exception e) {
   System.out.println("catch block started....");
   System.out.println(e.getMessage());
   System.out.println("catch block started....");
  } finally {
   System.out.println("Finally blocked called....");
  }
  System.out.println("Program Contines....");
 }

}
