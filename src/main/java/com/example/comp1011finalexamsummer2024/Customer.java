package com.example.comp1011finalexamsummer2024;

import com.google.gson.JsonArray;

import java.util.List;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private List<String> purchasedProducts;

    // Constructor
    public Customer(int id, String firstName, String lastName, String phoneNumber, List<String> purchasedProducts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.purchasedProducts = purchasedProducts;
    }

    // Getters and Setters - Need for TableView
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<String> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    // Calculate total purchases
    public double getTotalPurchases() {

        double total = 0.0;
        for (String product : purchasedProducts) {
            total += parsePriceFromProduct(product);
        }
        return total;
    }

    private double parsePriceFromProduct(String product) {
        return 0.0;
    }
}
