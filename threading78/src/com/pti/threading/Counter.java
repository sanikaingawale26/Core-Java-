package com.pti.threading;

public class Counter {
	 private int count=0;
	 public synchronized void inc() {
	  count++;
	  System.out.println(Thread.currentThread().getName()+" count= "+count);
	 }
	}
