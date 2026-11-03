package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Entry control-while
		int num = 2;
		int i = 1;
		while (i < 11) {
			System.out.println(num + "*" + i + "=" + num * i);
			i++;

		}
		System.out.println("Reverse");
		i = 10;
		while (i > 0){
			System.out.println(num + "*" + i + "=" + num * i);
			i--;
		}
		boolean conditionToEnd=true;
		Scanner scanner=new Scanner(System.in);
		while(conditionToEnd) {
			System.out.println("-----");
			System.err.println("Do you want to exit?yes/no ");
			final String msg=scanner.next();
			if(msg.equalsIgnoreCase("yes"))
			{
				conditionToEnd=false;
			}
			
		}
		scanner.close();
		

}
}
