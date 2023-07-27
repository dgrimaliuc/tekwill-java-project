package alexei_drujinin.Encapsulation;


public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product(4,"Wheels", 1000);

        System.out.println("Product ID: "+product.getProductID());
        System.out.println("Product name: "+product.getName());
        System.out.println("Product price: "+product.getPrice());
    }
}
