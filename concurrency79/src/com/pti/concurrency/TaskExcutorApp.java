package com.pti.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskExcutorApp {

 public static void main(String[] args) {
  try {
   List<Task> tasks=new ArrayList<>();
   
   tasks.add(new Task("Task-1"));
   tasks.add(new Task("Task-2"));
   tasks.add(new Task("Task-3"));
   
   ExecutorService pool=Executors.newFixedThreadPool(3);
   List<Future<String>> output=new ArrayList<>();

   for(Task t:tasks) {
    output.add(pool.submit(t));
   }
   for(Future<String> f:output) {
    System.out.println(f.get());
   }
   pool.shutdown();
  } catch (InterruptedException e) {
    
   e.printStackTrace();
  } catch (ExecutionException e) {
    
   e.printStackTrace();
  }
 }

}
