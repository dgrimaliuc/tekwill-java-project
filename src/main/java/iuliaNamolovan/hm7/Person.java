package main.java.iuliaNamolovan.hm7;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String n, int a, String ad) {
        this.name = n;
        this.age = a;
        this.address = ad;
    }

    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Address='" + address + '\'' +
                '}';
    }
}

