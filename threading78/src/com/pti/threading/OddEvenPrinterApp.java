package com.pti.threading;

public class OddEvenPrinterApp {

	 public static void main(String[] args) {
	  OddEvenPrinter printer=new OddEvenPrinter();
	//  NumberTask odd=new NumberTask(printer, 1);  
	//  NumberTask even=new NumberTask(printer, 2);
	//  odd.setName("Odd");
	//  even.setName("Even");  
	//  odd.start();
	//  even.start();
	  
	  OddThread oddThread=new OddThread(printer);
	  EvenThread evenThread=new EvenThread(printer);
	  oddThread.start();
	  evenThread.start();
	 }

	}
