package com.pti.restaurant.model;

public class Whitepasta extends Pasta {

    private double whiteSaucePrice;

    public Whitepasta() {
    }

    public Whitepasta(String pastaName, double basePrice, double whiteSaucePrice) {
        super(pastaName, basePrice);
        this.whiteSaucePrice = whiteSaucePrice;
    }

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
        return super.toString() +
                "\nWhite Sauce Price = " + whiteSaucePrice;
    }

}