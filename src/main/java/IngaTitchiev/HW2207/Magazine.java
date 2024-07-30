package IngaTitchiev.HW2207;

public class Magazine implements Printable {
    private String name;
    private String owner;

    public Magazine(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Magazine Name: " + name + "\nOwner: " + owner;
    }
}

