package com.pti.serilization;

import java.util.Scanner;

import com.pti.serilization.model.Person;
import com.pti.serilization.model.service.ReadService;
import com.pti.serilization.model.service.WriteService;

public class App {

 public static void main(String[] args) {
  final String fileName = "record.text";
  Person wp = null;

  WriteService writerService = new WriteService();
  ReadService readService = new ReadService();
  Scanner scanner = new Scanner(System.in);
  try {
   System.out.println("Menu:");
   System.out.println("1. Add Person Details");
   System.out.println("2. Read Person info");
   int choice = Integer.parseInt(scanner.nextLine());
   switch (choice) {
   case 1:
    System.out.println("Enter Person Name:");
    String name = scanner.nextLine();
    System.out.println("Enter Person Age:");
    int age = Integer.parseInt(scanner.nextLine());
    wp = new Person(name, age);
    writerService.write(fileName, true, wp);
    break;
   case 2:
    readService.read(fileName);
    break;
   default:
    System.out.println("choose either 1 or 2");
    break;
   }

  } catch (Exception e) {
   e.printStackTrace();
  }

 }

}

