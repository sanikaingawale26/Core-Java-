package com.pti.demo.model;

public class Product {

	 private int pid;
	 private String pname;
	 private double unitPrice;
	 private static int counter=0;
	 {this.pid=++counter;}
	 public Product() {
	  super();

	 }
	 public Product(int pid, String pname, double unitPrice) {
	  super();
	  this.pid = pid;
	  this.pname = pname;
	  this.unitPrice = unitPrice;
	 }
	 public Product(String pname, double unitPrice) {
	  super();
	  this.pname = pname;
	  this.unitPrice = unitPrice;
	 }
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
	 @Override
	 public String toString() {
	  return "Product [pid=" + pid + ", pname=" + pname + ", unitPrice=" + unitPrice + "]";
	 }
	 @Override
	 public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + pid;
	  result = prime * result + ((pname == null) ? 0 : pname.hashCode());
	  long temp;
	  temp = Double.doubleToLongBits(unitPrice);
	  result = prime * result + (int) (temp ^ (temp >>> 32));
	  return result;
	 }
	 @Override
	 public boolean equals(Object obj) {
	  if (this == obj) {
	   return true;
	  }
	  if (obj == null) {
	   return false;
	  }
	  if (getClass() != obj.getClass()) {
	   return false;
	  }
	  Product other = (Product) obj;
	  if (pid != other.pid) {
	   return false;
	  }
	  if (pname == null) {
	   if (other.pname != null) {
	    return false;
	   }
	  } else if (!pname.equals(other.pname)) {
	   return false;
	  }
	  if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
	   return false;
	  }
	  return true;
	 }
	 
	 
	}
