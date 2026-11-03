package com.pti.greetingapp;

import com.pti.greetingapp.model.Greeting;

public class GreetingApp {

	public static void main(String[] args) {
		Greeting greeting1=new Greeting();
		System.out.println(greeting1.greet());
		
		Greeting greeting2=new Greeting();
		greeting2.message="Good afternoon";
		System.out.println(greeting2.greet());
		
		Greeting greeting3=new Greeting();
		greeting3.message="Good evening";
		System.out.println(greeting3.greet());
		
		}
		
		
	}


