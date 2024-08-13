//Ariel Chase - 200566592
//Must track (at minimum):
//id, first name, last name, phone and purchased products

package com.example.comp1011finalexamsummer2024;

import com.google.gson.JsonArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Customer {
    int id;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    private JsonArray jsonObject;
    JsonArray purchases = jsonObject.isJsonArray("purchases");

    List<JsonArray> totalPurchases = Arrays.asList(purchases);

}


