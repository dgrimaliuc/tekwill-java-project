package ana_raetcaia;

public class ProductTest {
    public static void main (String[]args){

        Product productObj = new Product(8,"Table", 2500);

        System.out.println("Product ID: "+productObj.getId());
        System.out.println("Product name: "+productObj.getName());
        System.out.println("Product price: "+productObj.getPrice());
        }


}
