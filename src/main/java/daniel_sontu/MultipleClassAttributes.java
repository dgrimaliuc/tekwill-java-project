package main.java.daniel_sontu;

public class MultipleClassAttributes {
    String firstName = "Daniel";
    String lastName = "Sontu";
    int varsta = 25;


    public static void main(String[] args) {
        MultipleClassAttributes myObj = new MultipleClassAttributes();
        System.out.println("Name = " +myObj.firstName + " " +  myObj.lastName);
        System.out.println("Varsta = "+myObj.varsta);
    }
}
