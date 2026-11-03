package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Sortig of Array Element-Bublle Sort
		int[] numbers=null;
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter total number elements:");
			int maxSize=scanner.nextInt();
			numbers=new int[maxSize];
			System.out.println("Enter the numbers");
			for(int i=0;i<maxSize;i++) {
				numbers[i]=scanner.nextInt();
			}
			System.out.println("The Number array values are:");
			//Enchanced for loop to print array values
			for (int i:numbers) {
				System.out.println(i);
			}
			//for (int i=0;i<maxSize;i++) {
			//	System.out.println(numbers[i]);
			//}
			System.out.println("Using Bubble Sort-to print Sorted numbers");
			int pass=maxSize-1;  {
				for(int i=0;i<pass;i++)
				for(int j=0;j<maxSize-1;j++){
					if(numbers[j]>numbers[j+1]) {
						//swap
						int temp=numbers[j];
						numbers[j]=numbers[j+1];
						numbers[j+1]=temp;
					}
					
					
					
				}
				
			}
			System.out.println("Numbers Sorted-ASC");
			for(int i:numbers) {
				System.out.println(i);
			}
			
			scanner.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
					}
	}

}
