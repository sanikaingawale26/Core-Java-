package com.pti.threading;

public class EvenThread extends Thread {
	 private OddEvenPrinter printer;

	 public EvenThread(OddEvenPrinter printer) {
	  super();
	  this.printer = printer;
	  this.setName("Even");
	 }
	 @Override
	 public void run() {
	  for (int i = 2; i <11; i+=2) {

	   printer.newPrinter(i);
	  }
	 }
	}
