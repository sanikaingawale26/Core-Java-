package com.pti.restaurant.model;

public class Pasta {


		private String pastaName;
	    private double basePrice;
	   
	    // Default Constructor
	    public Pasta() {
	    }

	    // Parameterized Constructor
	    public Pasta(String pastaName, double basePrice) {
	        this.pastaName = pastaName;
	        this.basePrice = basePrice;
	    }

	    // Getters and Setters

	    public String getPastaName() {
	        return pastaName;
	    }

	    public void setPastaName(String pastaName) {
	        this.pastaName = pastaName;
	    }

	    public double getBasePrice() {
	        return basePrice;
	    }

	    public void setBasePrice(double basePrice) {
	        this.basePrice = basePrice;
	    }

	    public void prepare() {
	        System.out.println("Preparing " + pastaName);
	    }

	    public double calculatePrice() {
	        double gst = basePrice * 0.18;
	        return basePrice + gst;
	    }

	    @Override
	    public String toString() {
	        return "Pasta Name = " + pastaName +
	                "\nBase Price = " + basePrice;
	    

	
	

}
}
	
