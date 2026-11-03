package com.pti.greetingapp.model;

public class Greeting {
	private String message="Good Morning";//dadaMember or instanceVariable
	
	public String greet() {
		return this.message;//this->current object 
	}

}
