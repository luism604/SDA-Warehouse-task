package com.company.oop.groceries;

import com.company.oop.groceries.Product;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productBuffer = {"Milk", "Bread", "Sugar", "Meat", "Cabbage"};
        float minPrice = 1F;
        float maxPrice = 10F;
        Product[] stock;
        Product[] car = new Product[productBuffer.length];
        int carItemsCount = 0;

        stock = generateStock(productBuffer, minPrice, maxPrice);

        do {
            System.out.println("Your cart contains: " + carItemsCount + " products");
            System.out.println("You can buy any of our products:");
            System.out.println(Arrays.toString(productBuffer));

            System.out.print("Select a product to buy:");
            String productName = scanner.next();

            Product product = findProductByName(stock, productName);

            if (product != null) {
                car[carItemsCount] = product;
                carItemsCount++;
            } else {
                System.out.println("Sorry, but we do not have the requested product in existence.");
            }

        } while (carItemsCount < stock.length);

        float totalAmout = getTotalAmount(car);
        float roundAmount = roundWithDecimalPlaces(totalAmout, 2);

        System.out.println("You finished your purchase");
        System.out.println("You bought the products listed below:");
        System.out.println(Arrays.toString(car));
        System.out.println("You must to pay a total amount of: " + roundAmount + " EUR");


    }

    public static Product[] generateStock(String[] productNames, float minPrice, float maxPrice) {
        Random random = new Random();
        Product[] stock = new Product[productNames.length];

        for (int i = 0; i < productNames.length; i++) {
            String name = productNames[i];
            float price = minPrice + random.nextFloat() * (maxPrice - minPrice);
            Product product = new Product(name, price);
            stock[i] = product;
        }

        return stock;
    }

    public static Product findProductByName(Product[] products, String name) {
        Product product = null;
        boolean found = false;
        int i = 0;

        while (!found && i < products.length) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                product = products[i];
                found = true;
            }

            i++;
        }

        return product;
    }

    public static float getTotalAmount(Product[] car) {
        float amount = 0;

        for (Product product : car) {
            amount += product.getPrice();
        }

        return amount;
    }

    public static float roundWithDecimalPlaces(float value, long places) {
        long factor = (long) Math.pow(10, places);
        return Math.round(value * factor) / (float)factor;
    }
}


