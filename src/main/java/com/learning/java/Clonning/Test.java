package com.learning.java.Clonning;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Product product1 = new Product(UUID.randomUUID(), "Bottle", 100.00);
        List<String> features = new ArrayList<>();
        features.add("Capacity 1 litre");
        features.add("Can withstand temp from 0c to 100c");
        features.add("Easy to clean");
        product1.setProductFeatures(features);
        product1.setCategory("Kitchen Utilities");

        System.out.println("Product 1 : " + product1);

        Product product2 = (Product) product1.clone();
        product2.setPrice(200.00);
        product2.getProductFeatures().set(1, "Can withstand temp from -10c to 150c");
        System.out.println("Product 1 : " + product2);
    }
}
