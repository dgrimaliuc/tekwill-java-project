package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.HomeWorkTask7;

import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.HomeWorkTask7.Interface.Printable;

public class Magazine implements Printable, main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.Interfaces.Printable {

    private String name;
    private String owner;

    public Magazine(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void print() {
        Printable.super.print();
    }
}
