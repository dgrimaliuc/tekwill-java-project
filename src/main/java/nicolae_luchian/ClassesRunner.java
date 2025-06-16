package main.java.nicolae_luchian;

public class ClassesRunner {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.start();
        engine.accelerate();
        engine.stop();

        System.out.println(Engine.type);
        Engine.type = "V8";
        System.out.println(Engine.type);

        Bank bank = new Bank();
        bank.addFunds(10000);
        System.out.println(bank.getBalance());
        bank.addFunds(500);
        System.out.println(bank.getBalance());
        bank.withdrawFunds(300);
        System.out.println(bank.getBalance());

        bank.setBalance(100000);
        System.out.println(bank.getBalance());


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart("milk", 100);
        shoppingCart.addToCart("bread", 200);
        shoppingCart.addToCart("eggs", 300);

        shoppingCart.buyAll();
        System.out.println(shoppingCart.totalPrice);
    }
}
