package com.pti.demo;

public class App {

	public static void main(String[] args) {
		// looping->do-while,while,for
		int num=2;
		int i=1;//counter of loop starting from 1
		do {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}while(i<=10);
		System.out.println("After first do-while i="+i);
		do {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}while(i<=10);
		
		System.out.println("Reverse the table");
		
		i=10;
		do {
			System.out.println(num+"*"+i+"="+num*i);
			--i;
		}while(i>0);
		
		
	}

}
