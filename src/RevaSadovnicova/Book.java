package RevaSadovnicova;

public class Book {
    private String title;
    private String author;
    private Double price;
    private String isbn;

    public Book(String title,String author,Double prise,String isbn){
     this.title = title;
     this.author = author;
     this.price = prise;
     this.isbn = isbn;
    }

    public void displayDitails(){
        System.out.println(title + " " + author + " " + price + " " + isbn);
    }

    public void applyDiscount (double pro){
        System.out.println(price / 100 * (100 - pro));
    }
}
