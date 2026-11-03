package com.pti.lambda.demo.model;

import java.util.Comparator;

public class SortByAgeDesc implements Comparator<Person>{

 @Override
 public int compare(Person o1, Person o2) {
  
  return o2.getAge()-o1.getAge();
 }

}
