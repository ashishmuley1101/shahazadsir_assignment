package com.bridgelabz.shahazadsir;

public class Furniture {

    String type;
    String material;
    double price;
    double discount;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public void discountCalculate() {

        if (material.equals("plastic")) {
            discount = price * 20 / 100;

        } else if (material.equals("wood")) {
            discount = price * 15 / 100;

        } else {
            discount = price * 10 / 100;
        }
    }

    public void purchaseDetails() {
        System.out.println("Furniture's type : " + type);
        System.out.println("Furniture's material : " + material);
        System.out.println("Furniture's MRP Price Rs. " + price);
        System.out.println("Total Discount Rs. " + discount);
        double finalPrice = price - discount;
        System.out.println("Furniture Price after Discount Rs. " + finalPrice);
    }

}
