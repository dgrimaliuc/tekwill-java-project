package serghei_condrasov.encapsulation;

public class Product {

    /*Encapsulation
    3. Implement a class called "Product" with private instance variables for product ID, name, and price.
    Write getter and setter methods for each variable.*/

    private String ID;
    private String name;
    private double price;

    public Product(String ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
}
