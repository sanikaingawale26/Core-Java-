package com.pti.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import com.pti.serilization.model.Person;
import com.pti.serilization.model.service.ReadService;
import com.pti.serilization.model.service.WriteService;

public class App {

 public static void main(String[] args) {
  Set<Person> people=new HashSet<>();
  people.add(new Person("John",15));
  people.add(new Person("Jim",16));
  people.add(new Person("Jack",17));
  people.add(new Person("Jeff",18));
  people.stream().sorted((p1,p2)->p1.getPersonId()-p2.getPersonId()).forEach(System.out::println);
  WriteService writeService=new WriteService();
  ReadService readService=new ReadService();
  String fileName="ser_data.txt";
  try {
   System.out.println("Store"+people+" in file");
   FileOutputStream fileOutputStream=new FileOutputStream(fileName);
   ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
   objectOutputStream.writeObject(people);
   objectOutputStream.close();
   fileOutputStream.close();
   System.out.println("Completed writing info on file");
   
  } catch (Exception e) {
   e.printStackTrace();
  }
  System.out.println("Read all the objects from the file for People records");
  try {
   FileInputStream fileInputStream=new FileInputStream(fileName);
   ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
   
   Set<Person> readPersonSet=(Set<Person>) objectInputStream.readObject();
   System.out.println("From File we got:");
   readPersonSet.stream().sorted((p1,p2)->p1.getPersonId()-p2.getPersonId()).forEach(System.out::println);
   objectInputStream.close();
   fileInputStream.close();
   
  } catch (Exception e) {
   
  }
 }

}
