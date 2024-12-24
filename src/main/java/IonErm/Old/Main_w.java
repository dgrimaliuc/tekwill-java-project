package main.java.IonErm.Old;

public class Main_w {
    public static void main(String[] args) {
//        Fruit fruit1 = new Fruit("Avocado", "Green", 91.2);
//        fruit1.printInfo();

        Bank bank = new Bank();
        bank.setBalance(1100.345);
        System.out.println(bank.getBalance());
    }
}
