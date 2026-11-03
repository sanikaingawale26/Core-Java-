package com.pti.threading;

public class OddEvenPrinter {

	 private boolean oddTurn=true;
	 public synchronized void newPrinter(int n) {
	  try {
	   while((n%2==0)!=oddTurn) {
	    wait();
	   }
	   System.out.println(Thread.currentThread().getName()+" "+n);
	   oddTurn=!oddTurn;
	   notify();
	  
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }
	}
