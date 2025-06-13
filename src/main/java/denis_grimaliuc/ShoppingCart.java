package main.java.denis_grimaliuc;


import java.util.ArrayList;

/**
 * Creează o clasă ShoppingCart cu variabile „items” (ArrayList), „totalPrice” (double sau float)
 * și metodele addToCart(String Item, double price), clearCart() și buyAll():
 * <p>
 * •	addToCart(String Item, double price) va adăuga „item” la ArrayList-ul items și va adăuga „price” la totalPrice
 * •	clearCart() va reseta items și totalPrice
 * •	buyAll() va afișa produsele din coș și prețul total, iar după aceea va reseta items și totalPrice
 */
public class ShoppingCart {
    ArrayList<String> items;
    double totalPrice;


    ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }


    void addToCart(String item, double price) {
        this.items.add(item);
        this.totalPrice += price;
    }

    void clearCart() {
        this.items.clear();
        this.totalPrice = 0.0;
    }

    void buyAll() {
        System.out.println("Items in cart: " + items);
        System.out.println("Total price: " + totalPrice);
        clearCart();
    }
}
