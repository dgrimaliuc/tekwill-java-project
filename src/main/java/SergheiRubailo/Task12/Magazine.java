package SergheiRubailo.Task12;

public class Magazine implements Printable {

    String name;
    String owner;

    public Magazine(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Magazine name: " + name + ", owner: " + owner;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
