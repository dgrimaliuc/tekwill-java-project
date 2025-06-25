package main.java.alexandru_todos.abstraction_and_interface;

public class Magazine implements Printable {
    public String magazineName;
    public String magazinePublisher;

    public Magazine(String magazineName, String magazinePublisher) {
        this.magazineName = magazineName;
        this.magazinePublisher = magazinePublisher;
    }

    @Override
    public String toString() {
        return "Magazine: " + magazineName + " by " + magazinePublisher;

    }
}
