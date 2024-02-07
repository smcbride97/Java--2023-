package com.sean.Ecommerce;

public class Product {
    private int id;
    private String name;
    private String description;
    private float price;
    private int quantity;

    public Product(String name, String description, float price, int quantity) {
        this.id = 0;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return  String.format("Product ID %d: %s, %s, %.2f, %d", this.id, this.name, this.description, this.price, this.quantity);
    }
}
