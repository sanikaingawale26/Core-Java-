package com.pti.threading;

public class Task implements Runnable {

	 @Override
	 public void run() {
	  doTask();
	 }

	 private void doTask() {

	  for(int i=1;i<10;i++) {
	   System.out.println(i+" "+Thread.currentThread().getName());
	  }
	 }

	}
