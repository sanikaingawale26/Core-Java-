package com.pti.threading;

public class ThreadApp2 {

 public static void main(String[] args) {
  System.out.println("Main Thread Started ");
  
  MyThread myThread=new MyThread();
  myThread.setName("myThread");
  System.out.println("Before myThread start");
  for(int i=1;i<100;i++) {
   System.out.print("* ");
  }
  System.out.println();
  System.out.println("Start the myThread"+myThread.getName());  
  myThread.start();
  System.out.println("after myThread start");
  for(int i=1;i<100;i++) {
   System.out.print("*");
  }
  System.out.println();
  System.out.println("Main Thread Ended ");
  
 }

}

class MyThread extends Thread {

  @Override
  public void run() {
   System.out.println(Thread.currentThread().getName()+ " started");
   for (int i = 0; i < 5; i++) {
    System.out.println(i);  
   }
   System.out.println(Thread.currentThread().getName()+ " ended");
  }

}
