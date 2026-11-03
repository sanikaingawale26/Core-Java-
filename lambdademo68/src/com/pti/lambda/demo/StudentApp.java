package com.pti.lambda.demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import com.pti.lambda.demo.model.Student;


public class StudentApp {

	public static void main(String[] args) {
		Set<Student> students=new TreeSet<>();
		students.add(new Student("Sanika",85));
		students.add(new Student("Anika",65));
		students.add(new Student("Sai",76));
		students.add(new Student("Aarvi",87));
		students.add(new Student("Mansi",67));
        students.stream().forEach(System.out::println);
		  
        System.out.println("Sort By Student Name Asc");
    	Comparator<Student>c1=(Student s1,Student s2)->s1.getName().compareTo(s2.getName());
    	students.stream().sorted(c1).forEach(System.out::println);
    	
    	System.out.println("Sort By Student Name Desc");
    	Comparator<Student>c2=(Student s1,Student s2)->s2.getName().compareTo(s1.getName());
    	students.stream().sorted(c2).forEach(System.out::println);
    	
    	System.out.println("Sort By Marks Asc");	
    	Comparator<Student>c3=(Student s1,Student s2)->((int)(s1.getMarks()-s2.getMarks()));
    	students.stream().sorted(c3).forEach(System.out::println);
    	
    	System.out.println("Sort By Marks Desc");
    	Comparator<Student>c4=(Student s1,Student p2)->((int)(p2.getMarks()-s1.getMarks()));

    	students.stream().sorted(c4).forEach(System.out::println);
    	
    	System.out.println("Filter by marks>50");
    	Predicate<Student> p1=(std)->std.getMarks()>50;
    	students.stream().sorted(c3).filter(p1).forEach(System.out::println);




	}

}
