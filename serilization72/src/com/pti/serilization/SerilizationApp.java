package com.pti.serilization;

import com.pti.serilization.model.Person;
import com.pti.serilization.model.service.ReadService;
import com.pti.serilization.model.service.WriteService;

public class SerilizationApp {

 public static void main(String[] args) {
  final String fileName="record.text";
  final Person wp=new Person("John Doe",33);
   
  WriteService writerService=new WriteService();
  ReadService readService=new ReadService();
  System.out.println("Write Object to File");
  
  try {
   writerService.write(fileName, true, wp);
   readService.read(fileName);
   
  } catch (Exception e) {

   e.printStackTrace();
  }
 }

}
