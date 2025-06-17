package main.java.lilia_toma;

import java.util.ArrayList;

/**
 * Creaza o clasa ShoppingCard cu variabile "items" (ArrayList), "totalPrice" (double sau float)
 * si metodele addToCard(String Item, double price), clearCard() si buyAll():
 * addToCard(String Item, double price) va adauga "item" la ArrayList-uri items si va adauga "price" la totalPrice
 * clearCard() va reseta items si totalPrice
 * buyAll() va afisa produsele din cos si pretul total, iar dupa aceea va resta items si totalPrice
 */

public class ShoppingCard {
    ArrayList<String> items;
    double totalPrice;

    ShoppingCard() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    void addToCard(String item, double price) {
        this.items.add(item);
        this.totalPrice += price;
    }

    void clearCard() {
        this.items.clear();
        this.totalPrice = 0.0;
    }

    void buyAll() {
        System.out.println("Items in card: " + items);
        System.out.println("Total price: " + totalPrice);
        clearCard();
    }
}
