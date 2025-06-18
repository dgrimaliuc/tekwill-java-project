package main.java.nicolae_luchian;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<String> items;
    double totalPrice;

    public ShoppingCart() {
        this.items = new ArrayList<String>();
        this.totalPrice = 0.0;
    }


    public void addToCart(String item, double price) {
        this.items.add(item);
        this.totalPrice += price;
    }

    public void clearCart() {
        this.items.clear();
        this.totalPrice = 0.0;
    }

    void buyAll() {
        System.out.println("Items in cart: " + items);
        System.out.println("Total price: " + totalPrice);
        clearCart();
    }
}
