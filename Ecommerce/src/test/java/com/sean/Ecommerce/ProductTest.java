package com.sean.Ecommerce;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", "Macbook Pro 16-inch M2 Pro, 16 GB RAM", 2499.00f, 10);
        System.out.println(product);
        product.setId(8);
        System.out.println(product);
    }
}
