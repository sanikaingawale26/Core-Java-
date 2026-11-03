package com.pti.lambda.demo.model;

import java.util.Objects;

public class Product implements Comparable<Product>{
	private int productId;
	private String productName;
	private double unitPrice;

	private static int counter = 0;
	{
		this.productId = ++counter;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double unitPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	public Product(String productName, double unitPrice) {
		super();
		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId && Objects.equals(productName, other.productName);
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.getProductId()-o.getProductId();
	}
	
}
