package com.bridgelabz.shahazadsir;

import java.util.Scanner;
public class FurnitureMain {
    double price;

    public static void main(String[] args) {

        FurnitureMain furnitureMain = new FurnitureMain();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the type and material for furniture Choose from below list : ");
        System.out.println("Choose type of furniture : Table, Bed, Couch and Chair");
        String furnitureType = scan.next().toLowerCase();
        System.out.println("Choose material of furniture : Plastic, Stainlesssteel, wood");
        String furnitureMaterial = scan.next().toLowerCase();
        System.out.println(furnitureMaterial);
        System.out.println(furnitureType);

        if (furnitureType.equals("table") && furnitureMaterial.equals("wood")) {
            furnitureMain.price = 8000;
        } else if (furnitureType.equals("table") && furnitureMaterial.equals("stainlesssteel")) {
            furnitureMain.price = 4000;
        } else if (furnitureType.equals("bed") && furnitureMaterial.equals("stainlesssteel")) {
            furnitureMain.price = 10000;
        } else if (furnitureType.equals("bed") && furnitureMaterial.equals("wood")) {
            furnitureMain.price = 8000;
        } else if (furnitureType.equals("couch") && furnitureMaterial.equals("wood")) {
            furnitureMain.price = 6000;
        } else if (furnitureType.equals("couch") && furnitureMaterial.equals("stainlesssteel")) {
            furnitureMain.price = 7000;
        } else if (furnitureType.equals("couch") && furnitureMaterial.equals("plastic")) {
            furnitureMain.price = 5000;
        } else if (furnitureType.equals("chair") && furnitureMaterial.equals("wood")) {
            furnitureMain.price = 1500;
        } else if (furnitureType.equals("chair") && furnitureMaterial.equals("stainlesssteel")) {
            furnitureMain.price = 2500;
        } else if (furnitureType.equals("chair") && furnitureMaterial.equals("plastic")) {
            furnitureMain.price = 1000;
        } else {
            System.out.println("Please choose the proper furniture type and material");
        }
        System.out.println("----------------------------------------");

        Furniture furniture = new Furniture(furnitureType, furnitureMaterial, furnitureMain.price);
        furniture.discountCalculate();
        furniture.purchaseDetails();
    }
}

// Output : Enter the type and material for furniture Choose from below list : table
//          Choose type of furniture : Table, Bed, Couch and Chair
//          Choose material of furniture : Plastic, Stainlesssteel, wood : wood
//          ----------------------------------------
//          Furniture's type : table
//          Furniture's material : wood
//          Furniture's MRP Price Rs. 8000.0
//          Total Discount Rs. 1200.0
//          Furniture Price after Discount Rs. 6800.0
