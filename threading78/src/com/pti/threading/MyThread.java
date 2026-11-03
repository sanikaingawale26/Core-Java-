package com.pti.threading;

public class MyThread extends Thread {
	
		 private static final Counter counter=new Counter();
		 @Override
		 public void run() {
		  print();
		 }
		 private void print() {
		  for(int i=1;i<6;i++) {
		   
		   counter.inc();
		  }
		 }

	 
	}