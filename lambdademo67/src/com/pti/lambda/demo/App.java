package com.pti.lambda.demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.pti.lambda.demo.model.Product;

public class App {
     public static void main(String[] args) {
	Set<Product> products=new TreeSet<>();
	products.add(new Product("Pepsi",45.0));
	products.add(new Product("Maza",55.0));
	products.add(new Product("Limka",50.0));
	products.add(new Product("Cocokola",40.0));
	products.add(new Product("Fruity",45.0));
	products.stream().forEach(System.out::println);
	
	System.out.println("Sort By Product Name Asc");
	Comparator<Product>c1=(Product p1,Product p2)->p1.getProductName().compareTo(p2.getProductName());
	products.stream().sorted(c1).forEach(System.out::println);
	
	System.out.println("Sort By Product Name Desc");
	Comparator<Product>c2=(Product p1,Product p2)->p2.getProductName().compareTo(p1.getProductName());
	products.stream().sorted(c2).forEach(System.out::println);
	
	System.out.println("Sort By Unit Price Asc");	
	Comparator<Product>c3=(Product p1,Product p2)->((int)(p1.getUnitPrice()-p2.getUnitPrice()));
	products.stream().sorted(c3).forEach(System.out::println);
	
	System.out.println("Sort By Unit Price Desc");
	Comparator<Product>c4=(Product p1,Product p2)->((int)(p2.getUnitPrice()-p1.getUnitPrice()));

	products.stream().sorted(c4).forEach(System.out::println);



}
}
