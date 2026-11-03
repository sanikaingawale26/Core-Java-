package com.pti.restaurant.model;

public class WhitePasta extends Pasta {

    private double whiteSaucePrice;

    // Default Constructor
    public WhitePasta() {
    }

    // Parameterized Constructor
    public WhitePasta(String pastaName, double basePrice, double whiteSaucePrice) {
        super(pastaName, basePrice);
        this.whiteSaucePrice = whiteSaucePrice;
    }

    // Getter and Setter
    public double getWhiteSaucePrice() {
        return whiteSaucePrice;
    }

    public void setWhiteSaucePrice(double whiteSaucePrice) {
        this.whiteSaucePrice = whiteSaucePrice;
    }

    @Override
    public double calculatePrice() {
        double gst = getBasePrice() * 0.18;
        return getBasePrice() + gst + whiteSaucePrice;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWhite Sauce Price : " + whiteSaucePrice;
    }
}