package com.pti.serilization.model;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person>{
 
// private static final long serialVersionUID=1L;
 private static final long serialVersionUID=2L;
 private int personId;
 private String personName;
 private int age;
 private transient String password;
 
 
 private static int counter=0;
 {
  this.personId=++counter;
 }
 public Person() {
  super();
  // TODO Auto-generated constructor stub
 }
 public Person(int personId, String personName, int age) {
  super();
  this.personId = personId;
  this.personName = personName;
  this.age = age;
 }
 public Person(String personName, int age) {
  super();
  this.personName = personName;
  this.age = age;
 }
 
 public Person(String personName, int age, String password) {
  super();
  this.personName = personName;
  this.age = age;
  this.password = password;
 }
 public Person(int personId, String personName, int age, String password) {
  super();
  this.personId = personId;
  this.personName = personName;
  this.age = age;
  this.password = password;
 }
 public int getPersonId() {
  return personId;
 }
 public void setPersonId(int personId) {
  this.personId = personId;
 }
 public String getPersonName() {
  return personName;
 }
 public void setPersonName(String personName) {
  this.personName = personName;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 @Override
 public String toString() {
  return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
 }
 
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + age;
  result = prime * result + personId;
  result = prime * result + ((personName == null) ? 0 : personName.hashCode());
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
  if (age != other.age) {
   return false;
  }
  if (personId != other.personId) {
   return false;
  }
  if (personName == null) {
   if (other.personName != null) {
    return false;
   }
  } else if (!personName.equals(other.personName)) {
   return false;
  }
  return true;
 }
 @Override
 public int compareTo(Person o) {
  // TODO Auto-generated method stub
  return this.personId-o.personId;
 }
 
}
