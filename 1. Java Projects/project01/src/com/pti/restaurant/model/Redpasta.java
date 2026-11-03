package com.pti.restaurant.model;

public class Redpasta extends Pasta {

    private double redSaucePrice;

    public Redpasta() {
    }

    public Redpasta(String pastaName, double basePrice, double redSaucePrice) {
        super(pastaName, basePrice);
        this.redSaucePrice = redSaucePrice;
    }

    public double getRedSaucePrice() {
        return redSaucePrice;
    }

    public void setRedSaucePrice(double redSaucePrice) {
        this.redSaucePrice = redSaucePrice;
    }

    @Override
    public double calculatePrice() {

        double gst = getBasePrice() * 0.18;

        return getBasePrice() + gst + redSaucePrice;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRed Sauce Price = " + redSaucePrice;
    }

}
