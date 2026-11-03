package com.pti.threading;

public class ThreadApp {

 public static void main(String[] args) {
  Thread mainThread=Thread.currentThread();
  System.out.println("Current Thread Name:"+mainThread);
  
  Thread thread=new Thread();
  thread.setName("Thread 1");
  System.out.println(" "+thread.getName()+" started");
  thread.start();
  System.out.println("Current Thread Name:"+mainThread);
  System.out.println(" "+thread.getName()+" ended");
  
 }

}
