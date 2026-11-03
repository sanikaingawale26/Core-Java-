package com.pti.concurrency;

import java.util.concurrent.Callable;

public class Task implements Callable<String>{
	 private String taskName;

	 public Task(String taskName) {
	  super();
	  this.taskName = taskName;
	 }

	 @Override
	 public String call() throws Exception {
	  System.out.println(taskName+" started by "+Thread.currentThread().getName());
	  Thread.sleep(2000);
	  
	  return taskName;
	 }
	 

	}
