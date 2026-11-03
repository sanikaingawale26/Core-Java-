package com.pti.demo;

public class App {

	public static void main(String[] args) {
		// Creating arrays-Double
		// double [] prices=new double [5]; // 1st way
		double [] prices= {199.00,299.00,29.09,45.99,987.99};//explicitly giving variable
		for(int i=0;i<prices.length;i++) {
			System.out.println("Prices["+i+"]="+prices[i]);
		}
		System.out.println("display the highest price:");
		double maxPrice=prices[0];//assume first element is highest
		for(int i=0;i<prices.length;i++) {
			if(prices[i]>maxPrice) {
				maxPrice=prices[i];
			}
			
		}
		System.out.println(maxPrice);
			
		}
		}

	


