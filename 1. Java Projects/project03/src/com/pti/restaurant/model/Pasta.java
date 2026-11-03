package com.pti.restaurant.model;
public abstract class Pasta {

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

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "Pasta Name : " + pastaName + "\nBase Price : " + basePrice;
    }
}