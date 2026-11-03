package com.pti.demo;
import com.pti.model.EnglishGreeting;

import com.pti.model.GermanGreetings;

public class App{

 public static void main(String [] args){
  
  EnglishGreeting englishGreeting=new EnglishGreeting();
  GermanGreetings germanGreeting=new GermanGreetings();
  System.out.println("English Greetings: "+englishGreeting.greet());
  System.out.println("German Greeting: "+germanGreeting.greet());  
 }
}

