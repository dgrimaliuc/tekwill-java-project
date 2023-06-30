package serghei_condrasov.interfaces;

//Create classes Book and Magazine that implement the Printable interface.
//Magazine has name, owner.

public class Magazine implements Printable {
    private String nameMagazine;
    private String owner;

    public Magazine(String nameMagazine, String owner) {
        this.nameMagazine = nameMagazine;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "nameMagazine='" + nameMagazine + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
