package com.pti.lambda.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.pti.lambda.demo.model.Person;

public class App3 {

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
  System.out.println("############## Display list order by Name desc: using Comprable");
  Comparator<Person> sortByNameDesc=new Comparator<Person>() {

   @Override
   public int compare(Person o1, Person o2) {

    return o2.getName().compareTo(o1.getName());
   }
   
  };
  people.sort(sortByNameDesc);
  
  people.stream().forEach(System.out::println);

 }

}

