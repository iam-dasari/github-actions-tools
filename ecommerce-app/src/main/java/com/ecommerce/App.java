package com.ecommerce;

public class App {

    public static double calculateTotal(double price, int quantity) {

        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity cannot be negative");
        }

        return price * quantity;
    }

    public static void main(String[] args) {

        String product = "Laptop";
        double price = 75000;
        int quantity = 2;

        double total = calculateTotal(price, quantity);

        System.out.println("Product  : " + product);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
    }
}
