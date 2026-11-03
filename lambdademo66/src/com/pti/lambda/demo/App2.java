package com.pti.lambda.demo;

import java.util.ArrayList;
import java.util.List;

import com.pti.lambda.demo.model.Person;
import com.pti.lambda.demo.model.SortByAgeAsc;
import com.pti.lambda.demo.model.SortByAgeDesc;
import com.pti.lambda.demo.model.SortByName;

public class App2 {

 public static void main(String[] args) {
  List<Person> people=new ArrayList<>();
  people.add(new Person("Ajit", 50));
  people.add(new Person("Amit", 18));
  people.add(new Person("Ankit", 22));
  people.add(new Person("Sujit", 23));
  people.add(new Person("Jeet", 20));
  people.add(new Person("Aakash", 51));
  people.add(new Person("Anish", 52));
  people.add(new Person("Amar", 35));
  people.add(new Person("Tarun", 45));
  people.add(new Person("Ankita", 16));
  System.out.println("############## Display list order by personId: using Comprable");
  people.stream().forEach(System.out::println);
  System.out.println("############## Display list order by Name: using Comprable");
  people.sort(new SortByName());
  people.stream().forEach(System.out::println);
  System.out.println("############## Display list order by Age Asc: using Comprable");
  people.sort(new SortByAgeAsc());
  people.stream().forEach(System.out::println);
  System.out.println("############## Display list order by Age Desc: using Comprable");
  people.sort(new SortByAgeDesc());
  people.stream().forEach(System.out::println);
  
 }

}
