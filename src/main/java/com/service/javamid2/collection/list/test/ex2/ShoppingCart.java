package com.service.javamid2.collection.list.test.ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private List<Item> shoppingCart = new ArrayList();

    public ShoppingCart() {
    }

    public void addItem(Item item1) {
        shoppingCart.add(item1);
    }

    public void displayItems() {
        System.out.println("상품 출력");
        for (Item item : shoppingCart) {
            System.out.println("상품명"+ item.getName() +"합계 " + item.getTotalPrice());
        }

        System.out.println("전체 가격의 합" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : shoppingCart) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
