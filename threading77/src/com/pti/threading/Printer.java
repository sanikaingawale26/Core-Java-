package com.pti.threading;

public class Printer extends Thread {
	@Override
	 public void run() {
	  print();
	 }

	 private void print() {
	  for(int i=1;i<10;i++) {
	   System.out.println(i+" ");
	  }
	 }

}
