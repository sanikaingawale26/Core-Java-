package com.pti.demo;

import java.util.ArrayList;//implementation
import java.util.Iterator;
import java.util.List; // interface

public class App {
 public static void main(String[] args) {
//  List of Student Names
  List<String> students= new ArrayList<String>();
  students.add("Bob");
  students.add("Donald");
  students.add("Alice");
  students.add("Denis");
  System.out.println("Studnets: "+students);
  System.out.println("First Student Name: "+students.get(0));
  //last student name: at students.size()-1
  System.out.println("Last Student Name: "+students.get(students.size()-1));
  //Display all names on new row- using Iterator 
  System.out.println("##########");
  System.err.println("Using -iterator");
  Iterator<String> iterator=students.iterator();
  while(iterator.hasNext()) {
   System.out.println(iterator.next());
  }
  System.err.println("Using old for ");
  for(int i=0;i<students.size();i++) {
   System.out.println(students.get(i));
  }
  System.err.println("Using enhanced for loop ");
  for(String name: students) {
   System.out.println(name);
  }
 }
}
