package IgorTabirta.Les_July19.Inheritance;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }


}

