package roman_marcov.Encapsulation;

public class Product {

//    3. Implement a class called "Product" with private instance variables for product ID, name, and price.
//    Write getter and setter methods for each variable.

    private int productPrice;
    private String productID, productName;

    public Product(String productID, String productName, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
