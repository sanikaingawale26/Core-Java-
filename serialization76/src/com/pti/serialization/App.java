package com.pti.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pti.serialization.model.Person;

public class App {

 public static void main(String[] args) {
  try {
   Person p=new Person("John Doe",1999,18);
   System.out.println("Write Object to file ");
   FileOutputStream fileOutputStream=new FileOutputStream("person.ser");
   ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
   
   objectOutputStream.writeObject(p);
   objectOutputStream.close();
   fileOutputStream.close();
   
   System.out.println("Object saved successfully");
   
   FileInputStream fileInputStream=new FileInputStream("person.ser");
   ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
   
   System.out.println("Person object values are: ");
   Person p2=(Person) objectInputStream.readObject();
   System.out.println("Person Id:"+p2.getPersonId());
   System.out.println("Person Name:"+p2.getPersonName() );
   System.out.println("DOB Year:"+p2.getDobYear());
   System.out.println("Age:"+p2.getAge());
   objectInputStream.close();
   fileInputStream.close();
   
  } catch (Exception e) {
   e.printStackTrace();
  }

 }

}
