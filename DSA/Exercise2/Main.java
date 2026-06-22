package com.dn5.dsa.exercise2;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mobile", "Electronics"),
                new Product(3, "Shoes", "Fashion"),
                new Product(4, "Watch", "Fashion")
        };

        System.out.println("Linear Search Result:");

        Product linearResult =
                SearchOperations.linearSearch(products, "Mobile");

        if (linearResult != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + linearResult.productId);
            System.out.println("Name: " + linearResult.productName);
            System.out.println("Category: " + linearResult.category);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println("\nBinary Search Result:");

        Product binaryResult =
                SearchOperations.binarySearch(products, "Mobile");

        if (binaryResult != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + binaryResult.productId);
            System.out.println("Name: " + binaryResult.productName);
            System.out.println("Category: " + binaryResult.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
}