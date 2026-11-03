package com.pti.lambda.demo.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int studentId;
	private String name;
	private int marks;

	private static int counter = 0;
	{
		this.studentId = ++counter;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
     
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && studentId == other.studentId;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getStudentId()-o.getStudentId();
	}

}
