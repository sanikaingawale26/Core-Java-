package com.pti.collection.demo;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

 public static void main(String[] args) {
  
  Map<String,Integer> studentMarks=new HashMap<>();
  System.out.println("HashMap");
  studentMarks.put("Alice",  56);
  studentMarks.put("Bob",  57);
  studentMarks.put("Allen",  58);
  studentMarks.put("Teller",  59);
  System.out.println("studentMarks:"+studentMarks);
  System.out.println("TreeMap");
  studentMarks=new TreeMap<>();
  studentMarks.put("Alice",  56);
  studentMarks.put("Bob",  57);
  studentMarks.put("Allen",  58);
  studentMarks.put("Teller",  59);
  System.out.println("studentMarks:"+studentMarks);
  System.out.println("LinkedHashMap");
  studentMarks=new LinkedHashMap<>();
  studentMarks.put("Alice",  56);
  studentMarks.put("Bob",  57);
  studentMarks.put("Allen",  58);
  studentMarks.put("Teller",  59);
  System.out.println("studentMarks:"+studentMarks);
  System.out.println("HashMap to test Map methods");
  studentMarks=new HashMap<>();
  System.out.println("HashMap");
  studentMarks.put("Alice",  56);
  studentMarks.put("Bob",  57);
  studentMarks.put("Allen",  58);
  studentMarks.put("Teller",  59);
  System.out.println("get(key) -> fetch value");
  System.out.println("Get Score for Alice: "+studentMarks.get("Alice"));
  System.out.println("Get Score for Allen: "+studentMarks.get("Allen"));
  System.out.println("Get Score for Bob: "+studentMarks.get("Bob"));
  System.out.println("containsKey(key)");
  System.out.println(studentMarks.containsKey("Teller")?"Teller Available":"Teller Not Available");
  System.out.println("remove(key)");
  studentMarks.remove("Teller");
  System.out.println(studentMarks.containsKey("Teller")?"Teller Available":"Teller Not Available");
  System.out.println("Key Set: "+studentMarks.keySet());
  System.out.println("Values:  "+studentMarks.values());
  System.out.println("EntrySet:  "+studentMarks.entrySet());
  System.out.println("Read all values of HashMap: using Map.Entry over entrySet() ");
  
  for(Map.Entry<String,Integer> entry:studentMarks.entrySet()) {
   System.out.println(entry);
  }
  System.out.println("use entry.getKey() and entry.getValue()");
  for(Map.Entry<String,Integer> entry:studentMarks.entrySet()) {
   System.out.println(entry.getKey()+":"+entry.getValue());
  }
  System.out.println("using keySet()");
  for(String name: studentMarks.keySet()) {
   System.out.println(name+":"+studentMarks.get(name));
  }
  System.out.println("using keySet(): display all keys on new row");
  for(String name: studentMarks.keySet()) {
   System.out.println(name);
  }
  System.out.println("using values(): display all value on new row");
  for(int mark: studentMarks.values()) {
   System.out.println(mark);
  }
  System.out.println("Enhanced for loop- JDK 8 Lambda (->)");
  studentMarks.forEach((name,marks)-> System.out.println(name+":"+marks));
  
 }

}
