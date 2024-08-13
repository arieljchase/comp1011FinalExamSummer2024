//Ariel Chase - 200566592
//Must track: sku, name, sale price, regular price,
//and string to hold url information for the image
//should have a toString() method
//method should format response as: "[name]-$[sale price]"
//ex: "T-shirt with logo-$17.00"

package com.example.comp1011finalexamsummer2024;

import com.google.gson.JsonArray;
public class Product {
    private String sku;
    private String name;
    private double salePrice;
    private double regularPrice;
    private String image;

    @Override
    public String toString() {
        return String.format("%s-$%.2f", name, salePrice);
    }
}
