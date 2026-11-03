package com.pti.demo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lhs is always variable 
				//String name="Sai";
				//String name=new String("Sai");
				String name1="Sai";
				String name2="Sai";
				String name3="Sai";
				String name4="Sai";
		//everyobject gets unique hexacode-hashcode
				System.out.println("name1.hashcod()"+name1.hashCode());
				System.out.println("name2.hashcod()"+name2.hashCode());
				System.out.println("name3.hashcod()"+name3.hashCode());
				System.out.println("name4..hashcod()"+name4.hashCode());
				
				name3=name1+" "+name2;
				System.out.println("name1.hashcod()"+name1.hashCode());
				System.out.println("name2.hashcod()"+name2.hashCode());
				System.out.println("name3.hashcod()"+name3.hashCode());
				System.out.println(name1);
				System.out.println(name2);
				System.out.println(name3);
				
				name4="Sanika";
				System.out.println(name4);
				System.out.println(name4.hashCode());

	}

}
