package com.pti.demo;

public class App {

	public static void main(String[] args) {
		//unary ++ increment by 1
		int num1=10;
		int result=num1+1;
		System.out.println("num1:="+num1);
		System.out.println("result:="+result);
		//Unary ++num1-- Pre increment
		result=++num1;//(num1+1)=>result=num1
		System.out.println("++num1:="+num1);
		System.out.println("result:="+result);
		//Unary num1++ --Post Increment 
				result=num1++;//result=num1;=>num1=num1+1
				System.out.println("num1++:="+num1);
				System.out.println("result:="+result);
				int num2=30;
				int result2=0;
				//Unary --num2
				result2=--num2;
				System.out.println("--num2:="+num2);
				System.out.println("result2:="+result2);
				//Unary num2--
				result2=num2--;
				System.out.println("num2--:="+num2);
				System.out.println("result2:="+result2);
		

	}

}
