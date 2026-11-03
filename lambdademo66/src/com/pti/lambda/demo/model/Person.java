package com.pti.lambda.demo.model;

public class Person {

 private int personId;
 private String name;
 private int age;
 
 private static int counter=0;
 {
  this.personId=++counter;
 }
 public Person() {
  super();
  
 }
 public Person(int personId, String name, int age) {
  super();
  this.personId = personId;
  this.name = name;
  this.age = age;
 }
 public Person(String name, int age) {
  super();
  this.name = name;
  this.age = age;
 }
 public int getPersonId() {
  return personId;
 }
 public void setPersonId(int personId) {
  this.personId = personId;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 @Override
 public String toString() {
  return "Person [personId=" + personId + ", name=" + name + ", age=" + age + "]";
 }
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + personId;
  return result;
 }
 @Override
 public boolean equals(Object obj) {
  if (this == obj) {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  Person other = (Person) obj;
  if (personId != other.personId) {
   return false;
  }
  return true;
 }
 
}
