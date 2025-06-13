package main.java.denis_grimaliuc;

public class MainOOP {


    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart("Apple", 1.0);
        cart.addToCart("Banana", 0.5);
        cart.addToCart("Orange", 0.75);
        cart.addToCart("Milk", 1.25);
        cart.buyAll();


        cart.buyAll();

    }
}
