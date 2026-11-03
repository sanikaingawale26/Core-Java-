package com.pti.serilization.model.service;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

import com.pti.serilization.model.Person;

public class WriteService {
//01001
	public void write(String fileName, boolean append, Set<Person> people) throws Exception {
		FileOutputStream fos = new FileOutputStream(fileName, append);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(people);
		oos.close();
		fos.close();
		System.out.println("Person Object saved Successfully!");
	}
}
