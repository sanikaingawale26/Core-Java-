package com.pti.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pti.serilization.model.Person;

public class App {

 public static void main(String[] args) {
  Person person=new Person("John Doe",10,"Dr3am3@tower");
  try {
   System.out.println("Store "+person.getPersonName()+"in person.ser");
   FileOutputStream fileOutputStream=new FileOutputStream("person.ser");
   ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
   objectOutputStream.writeObject(person);
   objectOutputStream.close();
   fileOutputStream.close();
   System.out.println("Successfuly saved in file");
   System.out.println("Read the details from person.ser");
   FileInputStream inputStream=new FileInputStream("person.ser");
   ObjectInputStream oiSteram=new ObjectInputStream(inputStream);
   Person p=(Person) oiSteram.readObject();
   System.out.println("Person.ser has ");
   System.out.println(p.getPersonId()+":"+p.getPersonName()+":"
   +p.getAge()+":"+p.getPassword());
   oiSteram.close();
   inputStream.close();
   System.out.println("Successfuly retrived object from file");
  } catch (Exception e) {
   e.printStackTrace();
  }

 }

}
