package com.pti.threading;
public class NumberTask extends Thread {
	 private OddEvenPrinter printer;
	 private int start;

	 public NumberTask(OddEvenPrinter printer, int start) {
	  super();
	  this.printer = printer;
	  this.start = start;
	 }

	 @Override
	 public void run() {
	  for (int i = start; i <= 10; i++) {

	   printer.newPrinter(i);
	  }
	 }

	}
