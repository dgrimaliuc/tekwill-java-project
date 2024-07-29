package IvanTrembaci.src.main.java.ChirilBortnicov.Lesson2407;

public class Magazine implements Printable{

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Magazine(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    private String name;
    private String owner;

    @Override
    public void print() {
        System.out.println(this);
    }
}
