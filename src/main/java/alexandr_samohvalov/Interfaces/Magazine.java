package alexandr_samohvalov.Interfaces;

public class Magazine implements Printable{
    private String name;
    private String owner;

    public Magazine(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Magazine: " + name + ", Owner: " + owner;
    }
}



