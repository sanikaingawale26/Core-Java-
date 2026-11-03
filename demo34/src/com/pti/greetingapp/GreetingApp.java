package com.pti.greetingapp;

import com.pti.greetingapp.model.Greeting;

public class GreetingApp {

	public static void main(String[] args) {
		Greeting greeting=new Greeting();
		System.out.println(greeting.greet());
		
		//passing custom greeting using constructor
		
		Greeting greeting1=new Greeting("good Afternoon");
		System.out.println(greeting1.greet());
		
		Greeting greeting2=new Greeting("good Evening");
		System.out.println(greeting2.greet());
		
		
		
		
	}

}
