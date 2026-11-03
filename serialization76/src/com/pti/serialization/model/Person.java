package com.pti.serialization.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDate;

public class Person implements Comparable<Person>,Externalizable{
 private static final long serialVersionUID=1L;
 private int personId;
 private String personName;
 private int dobYear;
 private transient int age;
  
 private static int counter=0;
 {
  this.personId=++counter;
 }
 public Person() {
  super(); 
 }
 public Person(int personId, String personName, int dobYear, int age) {
  super();
  this.personId = personId;
  this.personName = personName;
  this.dobYear = dobYear;
  this.age = age;
 }
 public Person(String personName, int dobYear, int age) {
  super();
  this.personName = personName;
  this.dobYear = dobYear;
  this.age = age;
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
 public int getDobYear() {
  return dobYear;
 }
 public void setDobYear(int dobYear) {
  this.dobYear = dobYear;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + dobYear;
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
  if (dobYear != other.dobYear) {
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
 public String toString() {
  return "Person [personId=" + personId + ", personName=" + personName + ", dobYear=" + dobYear + "]";
 }
 
 @Override
 public int compareTo(Person o) {
 
  return this.personId-o.personId;
 }
 
 
 @Override
 public void writeExternal(ObjectOutput out) throws IOException {
  out.writeInt(this.personId);
  out.writeObject(this.personName);
  out.writeInt(this.dobYear );
  this.age=LocalDate.now().getYear()-dobYear;
  out.writeInt(this.age);
  
 }
 @Override
 public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
  this.personId=in.readInt();
  this.personName=(String) in.readObject();
  this.dobYear=in.readInt();
  this.age=in.readInt();
  
 }
 
 

}
