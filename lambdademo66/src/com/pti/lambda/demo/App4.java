package com.pti.lambda.demo;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.pti.lambda.demo.model.Person;

public class App4 {

	public static void main(String[] args) {
		
		List<Person> people=new ArrayList<>();
		people.add(new Person("Ajit", 50));
		people.add(new Person("Amit", 18));
		people.add(new Person("Ankit", 22));
		people.add(new Person("Sujit", 23));
		people.add(new Person("Jeet", 20));
		people.add(new Person("Aakash", 51));
		people.add(new Person("Anish", 52));
		people.add(new Person("Amar", 35));
		people.add(new Person("Tarun", 45));
		people.add(new Person("Ankita", 16));
		System.out.println("############## Display list order by personId: using Comprable");
		people.stream().forEach(System.out::println);
		System.out.println("############## Display list order by Name desc: using Comprable");
		Comparator<Person> c=(Person o1, Person o2)->o2.getName().compareTo(o1.getName());
		people.sort(c);
		people.stream().forEach(System.out::println);
		System.out.println("############## Display list order by Name Asc: using Comprable");
		Comparator<Person> c2=(Person o1, Person o2)->o1.getName().compareTo(o2.getName());
		people.sort(c2);
		people.stream().forEach(System.out::println);
		System.out.println("############## Display list order by Age Asc: using Comprable");
		Comparator<Person> c3=(Person o1, Person o2)->o1.getAge()-(o2.getAge());
		people.sort(c3);

		people.stream().forEach(System.out::println);
		System.out.println("############## Display list order by Age Asc: using Comprable");
		Comparator<Person> c4=(Person o1, Person o2)->o2.getAge()-(o1.getAge());
	    people.stream().forEach(System.out::println);
         
        people.stream().sorted(c4).forEach(System.out::println);

	}

}
