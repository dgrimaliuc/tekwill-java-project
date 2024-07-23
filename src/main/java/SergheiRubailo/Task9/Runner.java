package SergheiRubailo.Task9;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount(1, 1000, "John Smith");
//
//        System.out.println("ID: " + account1.getId() + ", Balance: " + account1.getBalance() + ", Name: " + account1.getAccountHolderName());
//
//        account1.setId(1);
//        account1.setBalance(2000);
//        account1.setAccountHolderName("Mike Smith");
//
//        System.out.println("ID: " + account1.getId() + ", Balance: " + account1.getBalance() + ", Name: " + account1.getAccountHolderName());
//
//        account1.setId(0);
//        account1.setBalance(0);
//        account1.setAccountHolderName("");
//
//        System.out.println("ID: " + account1.getId() + ", Balance: " + account1.getBalance() + ", Name: " + account1.getAccountHolderName());

        ArrayList<String> books = new ArrayList<>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");

        Library library = new Library("The best library", "next street", books);

        System.out.println("Books: " + library.getBooks());

        library.addBook("Book4");
        library.arendBook("Book2");

        System.out.println("Books: " + library.getBooks());
    }
}
