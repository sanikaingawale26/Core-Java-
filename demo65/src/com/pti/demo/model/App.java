package com.pti.demo.model;

public class App {

	 public static void main(String[] args) {
	  Product p1=new Product(1,"Pepsi 250",20.00);
	  Product p2=new Product(1,"Pepsi 250",20.00);
	  Product p3=new Product(2,"Maaza 250",20.00);
	  Product p4=new Product(3,"Thums up 250",20.00);
	  System.out.println(p1.hashCode()+" : "+p1);
	  System.out.println(p2.hashCode()+" : "+p2);
	  System.out.println(p3.hashCode()+" : "+p3);
	  System.out.println(p4.hashCode()+" : "+p4);
	  System.out.println("p1==p2: "+(p1==p2));
	  System.out.println("p1.equals(p2): "+p1.equals(p2));
	  
	  Student s1=new Student("Amit");
	  Student s2=s1;// referes to same object
	  Student s3=new Student(2,"Amit");
	  Student s4=new Student(3,"Amit");
	  
	  System.out.println("All Student Details: ");
	  System.out.println(s1+" hashCode:"+s1.hashCode());
	  System.out.println(s2+" hashCode:"+s2.hashCode());
	  System.out.println(s3+" hashCode:"+s3.hashCode());
	  System.out.println(s4+" hashCode:"+s4.hashCode());
	  
	  System.out.println("s1==s2:"+(s1==s2));
	  System.out.println("s1.equals(s2): "+s1.equals(s2));
	  
	  System.out.println("s3==s4:"+(s3==s4));
	  System.out.println("s3.equals(s4): "+s3.equals(s4));
	  
	  String name1="Sai";
	  String name2="Sai";
	  System.out.println("name1==name2: "+(name1==name2));
	  String name3=new String("Sai");//avoid heavy
	  System.out.println("name1==name3: "+(name1==name3));
	  System.out.println(name1.equals(name2));
	  System.out.println(name1.equals(name3));
	  
	 }
	}
