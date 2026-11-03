package com.pti.lambda.demo;

import java.util.Set;
import java.util.TreeSet;

import com.pti.lambda.demo.model.Person;
import com.pti.lambda.demo.model.SortByAgeAsc;
import com.pti.lambda.demo.model.SortByAgeDesc;
import com.pti.lambda.demo.model.SortByName;

public class App {

 public static void main(String[] args) {
//  List<Person> people=new ArrayList<>();
  Set<Person> people=new TreeSet<>();
  people.add(new Person("Ajit",50));
  people.add(new Person("Amit",18));
  people.add(new Person("Ankit",22));
  people.add(new Person("Sujit",23));
  people.add(new Person("Jeet",20));
  people.add(new Person("Aakash",51));
  people.add(new Person("Anish",52));
  people.add(new Person("Amar",35));
  people.add(new Person("Tarun",45));
  people.add(new Person("Ankita",16));
  //Old way
//  for(Person p:people) {
//   System.out.println(p);
//  }
  System.out.println("############## Display list order by personId: using Comprable");
  people.stream().forEach(System.out::println);
  
  System.out.println("############## Display list order by name: using Comparator");
  people=new TreeSet<>(new SortByName());
  people.add(new Person("Ajit",50));
  people.add(new Person("Amit",18));
  people.add(new Person("Ankit",22));
  people.add(new Person("Sujit",23));
  people.add(new Person("Jeet",20));
  people.add(new Person("Aakash",51));
  people.add(new Person("Anish",52));
  people.add(new Person("Amar",35));
  people.add(new Person("Tarun",45));
  people.add(new Person("Ankita",16));
  people.stream().forEach(System.out::println);
  System.out.println("############## Display list order by Age ASC: using Comparator");
  people=new TreeSet<>(new SortByAgeAsc());  
  people.add(new Person("Ajit",50));
  people.add(new Person("Amit",18));
  people.add(new Person("Ankit",22));
  people.add(new Person("Sujit",23));
  people.add(new Person("Jeet",20));
  people.add(new Person("Aakash",51));
  people.add(new Person("Anish",52));
  people.add(new Person("Amar",35));
  people.add(new Person("Tarun",45));
  people.add(new Person("Ankita",16));  
  people.stream().forEach(System.out::println);
  System.out.println("############## Display list order by Age DESC: using Comparator");
  people=new TreeSet<>(new SortByAgeDesc() );
  people.add(new Person("Ajit",50));
  people.add(new Person("Amit",18));
  people.add(new Person("Ankit",22));
  people.add(new Person("Sujit",23));
  people.add(new Person("Jeet",20));
  people.add(new Person("Aakash",51));
  people.add(new Person("Anish",52));
  people.add(new Person("Amar",35));
  people.add(new Person("Tarun",45));
  people.add(new Person("Ankita",16));
  
  people.stream().forEach(System.out::println);
  
 }

}
