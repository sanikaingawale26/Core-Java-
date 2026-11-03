package com.pti.serilization.model.service;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.pti.serilization.model.Person;

public class WriteService {
//01001
 public void write(String fileName,boolean append,Person person)throws Exception {
  FileOutputStream fos=new FileOutputStream(fileName, append); 
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(person);
  oos.close();
  fos.close();
  System.out.println("Person Object saved Successfully!");
 }
}
