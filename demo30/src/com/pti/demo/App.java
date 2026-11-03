package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int [] numbers=null;
		int maxSize=0;
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Size of an Array ");
			maxSize=scanner.nextInt();
			numbers=new int [maxSize];
			if(numbers!=null)
				System.out.println("Array of numbers created");
			
			System.out.println("Enter the numbers");
			for(int i=0;i<maxSize;i++) {
				numbers[i]=scanner.nextInt();
				}
			printArray(numbers);
			bubbleSort(numbers);
			printArray(numbers);
			scanner.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void bubbleSort(int[] numbers) {
		System.out.println("Sort Numbers Ascending-Bubble sort");
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-i-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					//swap
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;		
				}
			}
		}
		
		
	}

	private static void printArray(int[] numbers) {
		for(int i:numbers) {
			System.out.println(i);
		}
		}
		
	}


