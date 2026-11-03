package com.pti.threading;

public class OddThread extends Thread {

	 private OddEvenPrinter printer;

	 public OddThread(OddEvenPrinter printer) {
	  super();
	  this.printer = printer;
	  this.setName("Odd");
	 }

	 @Override
	 public void run() {
	  for (int i = 1; i <11; i+=2) {

	   printer.newPrinter(i);
	  }
	 }
}
