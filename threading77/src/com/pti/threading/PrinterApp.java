package com.pti.threading;

public class PrinterApp {

 public static void main(String[] args) {
  Printer printer1=new Printer();//Thread-0
  Printer printer2=new Printer();//Thread-1
  Printer printer3=new Printer();//Thread-2
  printer1.start();
  printer2.start();
  printer3.start();
 }

}