package alina_gutsul.encapsulation;

public class Product {
    private int productId;
    private String name;
    private double price;

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
