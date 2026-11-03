package com.pti.demo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=100;
		int result=0;
		result=add(num1,num2);
		System.out.println("Addition is:"+result);
		result=sub(num1,num2);
		System.out.println("Subtraction is:"+result);
		result=mul(num1,num2);
		System.out.println("Multiplication is:"+result);
		double divResult=div(num1,num2);
		System.out.println("Division:"+divResult);
		
		
		
		
	}
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	public static int mul(int num1,int num2) {
			return num1*num2;
	}
	public static double div(int num1,int num2) {
		return num1/num2;
	}
	
		
		

	}


