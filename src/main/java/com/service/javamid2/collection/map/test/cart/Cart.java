package com.service.javamid2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + quantity);
    }

    public void printAll() {
        for (Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        
    }

    public void minus(Product product, int quantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if (newQuantity < 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }
}
