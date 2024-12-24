package main.java.IonErm.HomeWork.OOP.Inheritance;

public class Person {
    public String name;
    public int age;
    private String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
