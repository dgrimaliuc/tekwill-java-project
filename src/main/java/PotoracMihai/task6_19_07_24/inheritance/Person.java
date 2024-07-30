package main.java.PotoracMihai.task6_19_07_24.inheritance;

public class Person {
    private String name;

    private int age;

    private String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printPerson() {
        System.out.println("Name: " + getName() + " Age" + getAge() + " Address: " + getAddress());
    }
}
