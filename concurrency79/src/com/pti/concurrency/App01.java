package com.pti.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App01 {

	 public static void main(String[] args) {
	  //run()
	  try {
	   //creat a pool of 4 reusable threads
	   ExecutorService pool=Executors.newFixedThreadPool(4);
	   Callable<Integer> task=()->40+2;
	   //executes the callable and returns a future
	   Future<Integer> f=pool.submit(task);
	   //get() waits for the task to finish and return the value
	   int result=f.get();
	   System.out.println("output of task is: "+result);
	   //stops the thread pool gracefully
	   pool.shutdown();
	  } catch (InterruptedException e) {   
	   e.printStackTrace();
	  } catch (ExecutionException e) {
	   e.printStackTrace();
	  }
	  

	 }

	}
	//compare(Object o1,Object o2)
	//Comparator<Integer> c=(o1,o2)->o1-o2;
