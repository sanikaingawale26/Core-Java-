package com.pti.threading;

public class TaskApp {

	 public static void main(String[] args) {
	  Task task1=new Task();//runnable logic
	  Task task2=new Task();//runnable logic
	  Task task3=new Task();//runnable logic
	  
	  Thread thread1=new Thread(task1);//Thread-0
	  Thread thread2=new Thread(task2);//Thread-1
	  Thread thread3=new Thread(task3);//Thread-2
	  
	  thread3.start();
	  thread1.start();
	  thread2.start();
	  
	  
	  
	 }

	}

