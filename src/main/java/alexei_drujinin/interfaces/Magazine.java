package alexei_drujinin.interfaces;

public class Magazine implements Printable{
    public String name;
    public String publisher;
    public int price;
    public Magazine (String name, String publisher, int price) {
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Name of the magazine: " + name + " / " + "The publisher: " + publisher + " / " + "The magazine's price: " + price;
    }
}
