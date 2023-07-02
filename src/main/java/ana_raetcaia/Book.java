package ana_raetcaia;
class Book implements Printable{
    private final String name;
    private final String author;
    private final double price;

    public Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this. price = price;
    }

    @Override
    public String toString() {
        return "Name of book: " + name + ". " + "Name of author" + author + ". " + "Price: " + price;
    }
}
