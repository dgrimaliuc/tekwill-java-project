package Leas_Liudmila.enumsAndInterface;

public class Magazine implements Printable {
    private String name;
    private String street;
    private String phone;

    public Magazine(String name, String street, String phone) {
        this.name = name;
        this.street = street;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + "\t | " + street + "\t\t | " + phone;
    }

}
