package com.pti.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

 public static void main(String[] args) {
  // List(I)->implemented in LinkedList
  List<String> fruitNames=new LinkedList<String>();
  //Adding names 
  fruitNames.add("Apple");
  fruitNames.add("Banana");
  fruitNames.add("Chicku");
  fruitNames.add("Peach");
  System.out.println("Size of the fruitList:"+fruitNames.size());
  System.out.println("Element at 0 position:"+fruitNames.get(0));
  System.out.println("Element at last position:"+fruitNames.get(fruitNames.size()-1));
  System.err.println("Using Iterator");
  Iterator<String> iterator=fruitNames.iterator();
  while(iterator.hasNext()) {
   System.out.println(iterator.next());
  }
  System.err.println("Using Enhanced for loop");
  for(String fruitName:fruitNames) {
   System.out.println(fruitName);
  }

 }

}
//Person ->People
//Student->STudents
//Book->Books
