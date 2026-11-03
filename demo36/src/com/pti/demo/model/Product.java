package com.pti.demo.model;

public class Product {
 
	private int pid;//0
	private String pname;//null
	private double unitPrice;//0.0
	private static int counter;
	static
	{
		System.out.println("Static block called ");
		counter=0;
	}
	
	{
		System.out.println("Non Static block");
		//this.pid++;//this.pid=this.pid+1
		this.pid=++counter;
	}
	//alt+s+c-> default constructor
	public Product() {
		super();
		
	}
	//alt+s+a -> default constructor
	public Product(int pid, String pname, double unitPrice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
	//alt+s+a -> default constructor
	public Product(String pname, double unitPrice) {
		super();
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
	//alt+s+r
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	//alt+s+s+s
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", unitPrice=" + unitPrice + "]";
	}
	
}
