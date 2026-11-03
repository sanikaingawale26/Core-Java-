package com.pti.serilization.model.service;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.pti.serilization.model.Person;

public class ReadService {

 public void read(String fileName)throws Exception {
  FileInputStream inputStream=new FileInputStream(fileName);
  ObjectInputStream ois=new ObjectInputStream(inputStream);
  
  Person person=(Person)ois.readObject();
  while(person!=null) {
   
   System.out.println("Person Record: ");
   System.out.println(person);
   person=(Person)ois.readObject();
  }
  
  
  
  ois.close();
  inputStream.close();
 }
}
